package com.example.retrofit

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.retrofit.remote.LoveApi
import com.example.retrofit.remote.LoveModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(private val api: LoveApi){
    fun getData(firstName: String, secondName: String) : MutableLiveData<LoveModel>{
        var love=MutableLiveData<LoveModel>()
        api.getLove(firstName, secondName).enqueue(object: Callback<LoveModel>{
            override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                if(response.isSuccessful){
                    response.body()?.let {
                        love.postValue(it)
                    }
                }
            }

            override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                Log.e("ololo","onFailure ${t.message}")

            }

        })

        return love
    }
}