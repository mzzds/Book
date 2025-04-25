package com.mahone.book.controller;

import com.mahone.book.entity.Movie;
import com.mahone.book.mapper.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieMapper movieMapper;

    @GetMapping("/findAll")
    public List<Movie> findAll(){
        List<Movie> movies = movieMapper.selectList(null);
        return movies;
    }
}
