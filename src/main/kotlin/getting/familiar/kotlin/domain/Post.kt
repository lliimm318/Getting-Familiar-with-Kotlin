package getting.familiar.kotlin.domain

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import java.time.LocalDate

@Entity(name = "post")
class Post (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,

    @Column(length = 30, nullable = false)
    var title: String = "none",

    @Column(columnDefinition = "TEXT", length = 1600, nullable = false)
    var content: String = "none",

    @CreatedDate
    @Column(nullable = false)
    var date: LocalDate = LocalDate.now(),

    @Column(length = 30, nullable = false)
    var writer: String = "none"

) {
    fun update(title: String, writer: String, content: String) {
        this.title = title
        this.writer = writer
        this.content = content
    }
}