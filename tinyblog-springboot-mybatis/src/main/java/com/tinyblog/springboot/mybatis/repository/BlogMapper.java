package com.tinyblog.springboot.mybatis.repository;

import java.util.List;

import com.tinyblog.springboot.mybatis.model.Blog;


/**
 * @see ;
 */
public interface BlogMapper {
    
    List<Blog> getAll();
    
    int deleteById(Long id);
    
    Blog findById(Long id);
    
    List<Blog> findByTitle(String title);
    
    int save(Blog blog);
    
    int update(Blog blog);
}
