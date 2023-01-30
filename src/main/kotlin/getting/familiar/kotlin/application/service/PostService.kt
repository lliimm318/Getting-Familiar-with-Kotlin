package getting.familiar.kotlin.application.service

import getting.familiar.kotlin.application.dto.request.PostRequest

interface PostService {

    fun createPost(postRequest: PostRequest)

    fun updatePost(postRequest: PostRequest): Int

    fun getPost(postId: Int)

    fun getPostList()

    fun removePost(postId: Int)

}