package com.bjpowernode.problem.controller;


import com.bjpowernode.problem.config.BookContainer;
import com.bjpowernode.problem.exp.BookNotFoundException;
import com.bjpowernode.problem.exp.IsbnNotFoundException;
import com.bjpowernode.problem.model.BookRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class BookController {

    // 注入 BookController
    @Autowired
    public BookContainer bookContainer;

    // 根據 isbn 查詢圖書，如果沒有查詢到則拋出異常
    @GetMapping("/book")
    public BookRecord getBook(String isbn) {
        Optional<BookRecord> bookRecord = bookContainer.getBooks().stream().filter(el -> el.isbn().equals(isbn)).findFirst();

        if (bookRecord.isEmpty()) {
            // throw new BookNotFoundException("isbn: " + isbn + " -> 沒有此圖書");
            throw new IsbnNotFoundException(HttpStatus.NOT_FOUND, "===isbn: " + isbn + " -> 沒有此圖書===");
        }
        return bookRecord.get();
    }

}
