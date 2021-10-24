package com.blog_creaters.blog_creaters.business.abstracts;

import java.util.List;

import com.blog_creaters.blog_creaters.core.utilities.result.*;
import com.blog_creaters.blog_creaters.entities.BlogCreators;


public interface BlogCreatorsService {
	
	public void add(BlogCreators blogCreators);
	public void update(BlogCreators blogCreators);
	public void delete(BlogCreators blogCreators);
	DataResult<List<BlogCreators>> getAll();
	DataResult<BlogCreators>getById(int id);
}
