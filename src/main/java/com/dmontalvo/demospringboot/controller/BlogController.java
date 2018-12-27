package com.dmontalvo.demospringboot.controller;

import com.dmontalvo.demospringboot.model.Blog;
import com.dmontalvo.demospringboot.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping(value = "/blogs", method = RequestMethod.GET)
    public ResponseEntity<List<Blog>> getBlogs() {
        return new ResponseEntity<List<Blog>>(blogService.listBlogs(), HttpStatus.OK);
    }

    @RequestMapping(value = "/blog/{id}", method = RequestMethod.GET)
    public ResponseEntity<Blog> getBlogById(@PathVariable("id") Integer id) {
        return new ResponseEntity<Blog>(blogService.blogById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/blog", method = RequestMethod.POST)
    public ResponseEntity<Blog> registerBlog(@RequestBody Blog blog) {
        return new ResponseEntity<Blog>(blogService.saveBlog(blog), HttpStatus.OK);
    }

    @RequestMapping(value = "/blog/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Blog> updateBlog(@RequestBody Blog blog) {
        return new ResponseEntity<Blog>(blogService.saveBlog(blog), HttpStatus.OK);
    }

    @RequestMapping(value = "/blog/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteBlog(@PathVariable("id") Integer id) {
        Blog blog = blogService.blogById(id);
        blogService.removeBlog(blog);
        return new ResponseEntity<String>("Blog eliminado", HttpStatus.OK);
    }

}
