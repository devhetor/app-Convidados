package com.example.convidados.viewModel

import androidx.lifecycle.ViewModel
import com.example.convidados.repository.GuestRepository

class GuestFormViewModel: ViewModel() {

    private val repository = GuestRepository.getInstance()

}