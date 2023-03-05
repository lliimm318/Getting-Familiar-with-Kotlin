package getting.familiar.kotlin.application.service

import getting.familiar.kotlin.application.dto.request.PostRequest
import getting.familiar.kotlin.application.dto.response.PostListResponse
import getting.familiar.kotlin.application.dto.response.PostResponse
import java.util.*

interface PostService {

    fun createPost(postRequest: PostRequest)

    fun updatePost(postId: Int, postRequest: PostRequest)

    fun getPost(postId: Int): Optional<PostResponse>?

    fun getPostList(): List<PostListResponse>

    fun removePost(postId: Int)

}