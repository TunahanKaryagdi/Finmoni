package com.tunahankaryagdi.add_payment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tunahankaryagdi.data.repository.FirebaseRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddPaymentViewModel @Inject constructor(
    private val firebaseRepository: FirebaseRepository
) : ViewModel(){


    init {
        add()
    }

    private fun add(){
        viewModelScope.launch {
            firebaseRepository.add()
        }
    }
}