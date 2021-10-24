package com.blogger.platform.api.controllers;

import com.blogger.platform.business.abstracts.BlogService;
import com.blogger.platform.core.utilities.results.DataResult;
import com.blogger.platform.core.utilities.results.Result;
import com.blogger.platform.entities.concretes.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/blogs/")
public class BlogsController {
    private BlogService blogService;

    @Autowired
    public BlogsController(BlogService blogService) {
        super();
        this.blogService = blogService;
    }

    @PostMapping("add")
    public Result add(@RequestBody Blog user) {
        return this.blogService.add(user);
    }

    @PostMapping("delete")
    public Result delete(@RequestParam int blogId) {
        return this.blogService.delete(blogId);
    }

    @GetMapping("getAll")
    public DataResult<List<Blog>> getAll() {
        return this.blogService.getAll();
    }

    @GetMapping("getById")
    public DataResult<Blog> getById(@RequestParam int blogId) {
        return this.blogService.getById(blogId);
    }

    @GetMapping("getByTitle")
    public DataResult<Blog> getByTitle(@RequestParam String title) {
        return this.blogService.getByTitle(title);
    }

}
