package dev.mohamed.foodies.data.remote.api

import dev.mohamed.foodies.model.Post
import retrofit2.Response
import retrofit2.http.GET

/**
 * Service to fetch Foodies posts using dummy end point .
 */
interface FoodiesService {

    @GET("/DummyFoodiumApi/api/posts/")
    suspend fun getPosts(): Response<List<Post>>

    companion object {
        const val FOODIES_API_URL = "https://patilshreyas.github.io/"
    }
}