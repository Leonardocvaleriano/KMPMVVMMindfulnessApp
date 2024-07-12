package com.codeplace.kmpmvvmmindfulnessapp.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import domain.models.VolumeInfo
import domain.repository.MindfulnessBooksRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MindfulnessBooksViewModel @Inject constructor (
    private val mindfulnessBooksRepository: MindfulnessBooksRepository
):ViewModel() {

    var mindfulnessBooksList by mutableStateOf<List<VolumeInfo>>(emptyList())
    var loading by mutableStateOf(true)


    fun getAllMindfulnessBooks() = viewModelScope.launch(Dispatchers.IO) {
        loading = false
        try {
            mindfulnessBooksList = mindfulnessBooksRepository.getAllMindfulnessBooks()
        } catch (e:Exception){
            e.message
        }
    }
}