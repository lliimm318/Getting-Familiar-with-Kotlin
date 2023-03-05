package getting.familiar.kotlin.application.dto.response

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDate

class PostListResponse (

    val postId: Int,

    val title: String,

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    val date: LocalDate

)