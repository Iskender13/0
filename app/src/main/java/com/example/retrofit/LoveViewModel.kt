package com.example.retrofit

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.Repository
import com.example.retrofit.remote.LoveModel

class LoveViewModel : ViewModel() {
    val repository=Repository()
    fun getLiveLoveData(firstName: String, secondName: String) : LiveData<LoveModel>{
        return repository.getData(firstName, secondName);
    }

}