package com.mahone.book.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


//@Entity
@TableName("book")
@Data
public class Book {
//    @Id
    @TableId(type = IdType.AUTO)
    private Integer id;

//    @Column(nullable = false)  // 添加非空约束
    @TableField("name")
    private String name;

//    @Column(nullable = false)  // 添加非空约束
    private String author;


}