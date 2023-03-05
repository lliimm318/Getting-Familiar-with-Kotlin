package getting.familiar.kotlin.application.service

import getting.familiar.kotlin.application.dto.request.PostRequest
import getting.familiar.kotlin.application.dto.response.PostListResponse
import getting.familiar.kotlin.application.dto.response.PostResponse
import getting.familiar.kotlin.domain.Post
import getting.familiar.kotlin.domain.PostRepository
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.util.*

@Service
class PostServiceImpl(

    private val postRepository: PostRepository

) : PostService {

    override fun createPost(postRequest: PostRequest) {
        val post = Post(
            title = postRequest.title,
            writer = postRequest.writer,
            content = postRequest.content,
            date = LocalDate.now()
        )

        postRepository.save(post)
    }

    override fun updatePost(postId: Int, postRequest: PostRequest) {
        val post = postRepository.findById(postId)
            .orElseThrow()

        post.update(
            title = postRequest.title,
            writer = postRequest.writer,
            content = postRequest.content
        )

        postRepository.save(post)
    }

    override fun getPost(postId: Int): Optional<PostResponse>? {
        val post = postRepository.findById(postId)
            .map {
                PostResponse(
                    postId = it.id,
                    title = it.title,
                    writer = it.writer,
                    content = it.content,
                    date = it.date
                )
            }

        return post
    }

    override fun getPostList(): List<PostListResponse> {
        val postList = postRepository.findAllByOrderByDateDesc()
            .map {
                PostListResponse(
                    postId = it.id,
                    title = it.title,
                    date = it.date
                )
            }

        return postList
    }

    override fun removePost(postId: Int) {
        val post = postRepository.findById(postId)
            .orElseThrow();

        postRepository.delete(post);
    }

}