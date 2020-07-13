package dev.mohamed.foodies.di.module

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dev.mohamed.foodies.data.remote.api.FoodiesService
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
class FoodiesApiModule {

    @Singleton
    @Provides
    fun provideRetrofitService(): FoodiesService = Retrofit.Builder()
        .baseUrl(FoodiesService.FOODIES_API_URL)
        .addConverterFactory(
            MoshiConverterFactory.create(
                Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
            )
        )
        .build()
        .create(FoodiesService::class.java)
}