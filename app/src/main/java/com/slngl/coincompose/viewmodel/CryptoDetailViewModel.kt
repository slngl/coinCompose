package com.slngl.coincompose.viewmodel

import androidx.lifecycle.ViewModel
import com.slngl.coincompose.model.Crypto
import com.slngl.coincompose.repository.CryptoRepository
import com.slngl.coincompose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CryptoDetailViewModel @Inject constructor(private val repository: CryptoRepository) :
    ViewModel() {
    suspend fun getCrypto(id: String): Resource<Crypto> {
        return repository.getCrypto(id)
    }
}
