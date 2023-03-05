package getting.familiar.kotlin.domain

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PostRepository : CrudRepository<Post, Int> {

    fun findAllByIdOrderByDateDesc(id: Int): Post

    fun findAllByOrderByDateDesc(): List<Post>

}