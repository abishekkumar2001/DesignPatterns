package com.principles.design.service;

import com.principles.design.entity.Books;
import com.principles.design.exception.ResourceNotFoundException;
import com.principles.design.repo.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {

    @Autowired
    private BooksRepository booksRepository;

    public List<Books> getAllBooks() {
        return booksRepository.findAll();
    }

    public Books getBookById(Integer bookId) {
        Books books = booksRepository.findByBookId(bookId);
        if(books == null){
            throw new ResourceNotFoundException("Book not found with ID: " + bookId);
        }
        return booksRepository.findByBookId(bookId);
    }

    public Books addBook(Books books) {
        return booksRepository.save(books);
    }

    public Books updateBook(Integer bookId, Books books) {
        Books book = booksRepository.findByBookId(bookId);
        if (book == null) {
            throw new ResourceNotFoundException("Book not found with ID: " + bookId);
        }
        book.setBookName(books.getBookName());
        book.setGenre(books.getGenre());
        return booksRepository.save(book);
    }

    public String deleteBook(Integer bookId) {
        Books books = booksRepository.findByBookId(bookId);
        if (books == null) {
            throw new ResourceNotFoundException("Book not found with ID: " + bookId);
        }
        booksRepository.deleteById(bookId);
        return "Book deleted successfully";
    }
}
