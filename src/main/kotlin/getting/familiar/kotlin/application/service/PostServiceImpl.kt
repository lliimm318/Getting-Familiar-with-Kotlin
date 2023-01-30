package getting.familiar.kotlin.application.service

import getting.familiar.kotlin.application.dto.request.PostRequest
import getting.familiar.kotlin.domain.PostRepository
import org.springframework.stereotype.Service

@Service
class PostServiceImpl(

    private val postRepository: PostRepository

) : PostService {

    override fun createPost(postRequest: PostRequest) {
        TODO("Not yet implemented")
    }

    override fun updatePost(postRequest: PostRequest): Int {
        TODO("Not yet implemented")
    }

    override fun getPost(postId: Int) {
        TODO("Not yet implemented")
    }

    override fun getPostList() {
        TODO("Not yet implemented")
    }

    override fun removePost(postId: Int) {
        TODO("Not yet implemented")
    }

}