package com.slngl.coincompose.repository

import com.slngl.coincompose.model.Crypto
import com.slngl.coincompose.model.CryptoList
import com.slngl.coincompose.service.CryptoAPI
import com.slngl.coincompose.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import java.lang.Exception
import javax.inject.Inject

@ActivityScoped
class CryptoRepository @Inject constructor(private val api: CryptoAPI) {
    suspend fun getCryptoList(): Resource<CryptoList> {
        val response = try {
            api.getCryptoList()
        } catch (e: Exception) {
            return Resource.Error("getCryptoList error")
        }
        return Resource.Success(response)
    }

    suspend fun getCrypto(id: String): Resource<Crypto> {
        val response = try {
            api.getCrypto()
        } catch (e: Exception) {
            return Resource.Error("getCrypto error")
        }
        return Resource.Success(response)
    }
}
