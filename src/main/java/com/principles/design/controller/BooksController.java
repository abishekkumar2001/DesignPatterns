package com.principles.design.controller;

import com.principles.design.entity.Books;
import com.principles.design.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
public class BooksController {

    @Autowired
    private BooksService booksService;

    @GetMapping("/books")
    public List<Books> getAllBooks(){
        return booksService.getAllBooks();
    }

    @GetMapping("/book/{bookId}")
    public Books getBookById(@PathVariable Integer bookId){
        return booksService.getBookById(bookId);
    }

    @PostMapping("/books")
    public Books addBook(@RequestBody Books books){
        return booksService.addBook(books);
    }

    @PutMapping("/books/{bookId}")
    public Books updateBook(@PathVariable Integer bookId, @RequestBody Books books){
        return booksService.updateBook(bookId,books);
    }

    @DeleteMapping("/books/{bookId}")
    public String deleteBook(@PathVariable Integer bookId){
        return booksService.deleteBook(bookId);
    }


}
