package com.blog_creaters.blog_creaters.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog_creaters.blog_creaters.business.abstracts.BlogCreatorsService;
import com.blog_creaters.blog_creaters.core.utilities.result.DataResult;
import com.blog_creaters.blog_creaters.entities.BlogCreators;

@RestController
@RequestMapping("api/blogcreators/")
public class BlogCreatorsController {
	private BlogCreatorsService blogCreatorsService;

	@Autowired
	public BlogCreatorsController(BlogCreatorsService blogCreatorsService) {
		this.blogCreatorsService = blogCreatorsService;
	}
	
	@GetMapping("add")
	public void add(BlogCreators blogCreators) {
		blogCreatorsService.add(blogCreators);
	}
	@GetMapping("update")
	public void update(BlogCreators blogCreators) {
		blogCreatorsService.add(blogCreators);
	}
	@GetMapping("delete")
	public void delete(BlogCreators blogCreators) {
		blogCreatorsService.add(blogCreators);
	}
	@GetMapping("getall")
	public DataResult<List<BlogCreators>> getAll(BlogCreators blogCreators) {
		return blogCreatorsService.getAll();
	}
}
