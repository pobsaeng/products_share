package com.products.models

import javax.persistence.*

@Entity
@Table
data class Book (
        @Id
        @GeneratedValue(strategy = GenerationType.TABLE)
        var id: Long? = null,
        var title: String? = "",
        var description: String? = "",
        var price: Double? = 0.0,
        var year: Int? = null,
        var author: String? = "",
        var isbn: String? = "",
        var category_id: Int? = null
)