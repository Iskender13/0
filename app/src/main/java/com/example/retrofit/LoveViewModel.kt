package com.example.retrofit

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.retrofit.remote.LoveModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoveViewModel @Inject constructor(private val repository: Repository) : ViewModel() {
    fun getLiveLoveData(firstName: String, secondName: String) : LiveData<LoveModel>{
        return repository.getData(firstName, secondName);
    }

}