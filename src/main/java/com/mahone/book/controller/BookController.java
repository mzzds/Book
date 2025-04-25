package com.mahone.book.controller;


import com.mahone.book.entity.Book;
import com.mahone.book.mapper.BookMapper;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/book")
@Tag(name = "Mahone")
public class BookController {

//    @Autowired
//    private BookRepository bookRepository;

    @Autowired
    private BookMapper bookMapper;

    @GetMapping("/findAll")
    @Operation(summary = "mz")
    public List<Book> findAll(){

//        return bookRepository.findAll();
        return null;
    }

    @GetMapping("/hello")
    @Operation(summary = "mz2")
    public String hello(){
        return "hello world!......";
    }

    @GetMapping("/find")
    public List<Book> find(){
        List<Book> books = bookMapper.selectList(null);
        System.out.println(books);
        return books;
    }

    @PostMapping("/save")
    public String save(Book book){
        int i = bookMapper.insert(book);
        if(i > 0){
            return "success";
        }else{
            return "fail";
        }
    }
}
