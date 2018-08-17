package com.products

import com.products.models.Book
import com.products.repository.BookRepository
import com.products.util.Utility
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan
class ProductsApplication {

//    @Bean
//    fun run(repository: BookRepository): CommandLineRunner {
//        return CommandLineRunner { args ->
//            println("CommandLineRunner1")
//            val util = Utility()
//            repository.save(Book(null, "Java 8 Programming", "For Beginer", 1250.00, 2017, "Jason", util.randomText(13), 1))
//            repository.save(Book(null, "Learning Kotlin Programming", "For Advance", 1590.00, 2018, "Tommy", util.randomText(13), 1))
//            repository.save(Book(null, "JavaScript Programming", "For Beginer", 1360.00, 2016, "Hope", util.randomText(13), 1))
//            repository.save(Book(null, "Core Python Programming", "For Advance", 1490.00, 2017, "John", util.randomText(13), 1))
//            repository.save(Book(null, "Learning Go Programming", "For Beginer", 1790.00, 2018, "Joe", util.randomText(13), 1))
//
//            val book2 = Book()
//            book2.id = 1
//            book2.title = "Python"
//            book2.author = "Pob"
//            book2.description = "For Beginer"
//
//            repository.updateBook(
//                    book2.title,
//                    book2.description,
//                    book2.price,
//                    book2.year,
//                    book2.author,
//                    book2.isbn,
//                    book2.category_id,
//                    book2.id
//            )
//
//            repository.findAll().forEach(::println)
//            println(repository.findById(1))
//        }
//    }
}

fun main(args: Array<String>) {
    runApplication<ProductsApplication>(*args)
}
