package getting.familiar.kotlin.application.controller

import getting.familiar.kotlin.application.dto.request.PostRequest
import getting.familiar.kotlin.application.dto.response.PostListResponse
import getting.familiar.kotlin.application.dto.response.PostResponse
import getting.familiar.kotlin.application.service.PostService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/post")
class PostController (
    private val postService: PostService
){

    @PostMapping
    fun savePost(postRequest: PostRequest) {
        postService.createPost(postRequest)
    }

    @PutMapping("{/postId}")
    fun updatePost(@PathVariable postId : Int, postRequest: PostRequest) {
        postService.updatePost(postId, postRequest)
    }

    @GetMapping("{/postId}")
    fun getPost(@PathVariable postId : Int): Optional<PostResponse>? {
        return postService.getPost(postId)
    }

    @GetMapping
    fun getPostList(): List<PostListResponse> {
        return postService.getPostList()
    }

    @DeleteMapping("{/postId}")
    fun deletePost(@PathVariable postId : Int) {
        postService.removePost(postId)
    }

    
}