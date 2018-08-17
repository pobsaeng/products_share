package com.products.repository

import com.products.models.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param


@Repository
interface BookRepository: JpaRepository<Book, Long> {
    @Query(value = "SELECT * FROM Book WHERE title = ?", nativeQuery = true)
    fun findByBookTitle(title: String)

//    @Modifying(clearAutomatically = true)
    @Query("UPDATE Book SET" +
            " title = ?" +
            " description = ?" +
            " price = ?" +
            " year = ?" +
            " author = ?" +
            " isbn = ?" +
            " category_id = ?" +
            " WHERE id = ?", nativeQuery = true)
    fun updateBook(
            title: String?,
            description: String?,
            price: Double?,
            year: Integer?,
            author: String?,
            isbn: String?,
            category_id: Integer?,
            id: Long?
    ): Int


}