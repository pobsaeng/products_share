package com.products.request

import com.products.models.Book
import org.springframework.web.bind.annotation.RequestBody
import javax.persistence.*

class BookRequest (
        var id: Long? = null,
        var title: String? = "",
        var description: String? = "",
        var price: Double? = 0.0,
        var year: Int? = null,
        var author: String? = "",
        var isbn: String? = "",
        var category_id: Int? = null
)