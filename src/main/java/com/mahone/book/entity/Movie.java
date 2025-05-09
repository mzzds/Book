package com.mahone.book.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("movie")
public class Movie {

    @TableId(type = IdType.AUTO)
    private int id;
    private String title;
    private String director;
    private int year;
}
