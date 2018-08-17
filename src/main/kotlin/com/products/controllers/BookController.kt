package com.products.controllers

import com.products.models.Book
import com.products.repository.BookRepository
import com.products.request.BookRequest
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
class BookController (val repository: BookRepository) {

    @PostMapping("/create")
    fun create(@RequestBody bookRequest: BookRequest): Book {
        val book = Book(
                bookRequest.id,
                bookRequest.title,
                bookRequest.description,
                bookRequest.price,
                bookRequest.year,
                bookRequest.author,
                bookRequest.isbn,
                bookRequest.category_id
        )
        return repository.save(book)
    }

    @GetMapping("/findAllBook")
    fun findAllBook() = repository.findAll()

    @GetMapping("/findByBookId/{id}")
    fun findByBookId(@PathVariable id: Long) = repository.findById(id)

    @GetMapping("/findByBookTitle/{title}")
    fun findByBookTitle(@PathVariable title: String) = repository.findByBookTitle(title)

}