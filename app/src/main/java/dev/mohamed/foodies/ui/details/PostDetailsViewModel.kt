package dev.mohamed.foodies.ui.details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import dev.mohamed.foodies.data.repository.PostsRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

@ExperimentalCoroutinesApi
class PostDetailsViewModel @Inject constructor(private val postsRepository: PostsRepository) :
    ViewModel() {

    fun getPost(id: Int) = postsRepository.getPostById(id).asLiveData()
}