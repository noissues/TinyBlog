package com.tinyblog.springboot.mybatis.service;

import java.util.List;
import java.util.Map;

import com.tinyblog.springboot.jdbctemplate.model.Blog;


public interface BlogService {
    int create(Blog blog);
    List<Blog> getBlogsByCondition(Map<String, Object> param);
    Blog getBlogById(Long id);
    int update(Blog blog);
    int deleteById(Long id);
}
