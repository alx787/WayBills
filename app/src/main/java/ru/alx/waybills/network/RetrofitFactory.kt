package ru.alx.waybills.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit

class RetrofitFactory {

    companion object {
        val instance = RetrofitFactory()
    }

    private fun okHttpInterceptor(): HttpLoggingInterceptor {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return httpLoggingInterceptor
    }

    private val okHtppClient = OkHttpClient.Builder().addInterceptor(okHttpInterceptor()).build()

    private val retrofitClient: Retrofit = Retrofit.Builder()
        .baseUrl("---")
        .client(okHtppClient)
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
        .build()
}