package com.mahone.book.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mahone.book.entity.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper extends BaseMapper<Book> {

//    //查询所有用户
//    @Select("select * from book")
//    public List<Book> find();
//
//    //添加用户
//    @Insert("insert into book values (#{id},#{name},#{author})")
//    public int insert(Book book);
}
