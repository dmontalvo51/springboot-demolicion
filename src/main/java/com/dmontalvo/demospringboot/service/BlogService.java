package com.dmontalvo.demospringboot.service;

import com.dmontalvo.demospringboot.model.Blog;
import com.dmontalvo.demospringboot.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;


    public List<Blog> listBlogs() {
        return blogRepository.findAll();
    }

    public Blog blogById(Integer id) {
        return blogRepository.getOne(id);
    }

    public Blog saveBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    public void removeBlog(Blog blog) {
        blogRepository.delete(blog);
    }

    public void removeBlogById(Integer id) {
        blogRepository.deleteById(id);
    }

}
