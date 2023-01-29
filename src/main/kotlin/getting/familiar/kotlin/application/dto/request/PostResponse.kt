package getting.familiar.kotlin.application.dto.request

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDate

class PostResponse (

    val postId: Int,

    val title: String,

    val writer: String,

    val content: String?,

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    val date: LocalDate? = null

) 