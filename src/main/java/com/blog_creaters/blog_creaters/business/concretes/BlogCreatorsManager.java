package com.blog_creaters.blog_creaters.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog_creaters.blog_creaters.business.abstracts.BlogCreatorsService;
import com.blog_creaters.blog_creaters.core.utilities.result.DataResult;
import com.blog_creaters.blog_creaters.dataAccess.abstracts.BlogCreatorsDao;
import com.blog_creaters.blog_creaters.entities.BlogCreators;

@Service
public class BlogCreatorsManager implements BlogCreatorsService {
	
	private BlogCreatorsDao blogCreatorsDao;

	@Autowired
	public BlogCreatorsManager(BlogCreatorsDao blogCreatorsDao) {
		this.blogCreatorsDao = blogCreatorsDao;
	}

	@Override
	public void add(BlogCreators blogCreators) {
		blogCreatorsDao.save(blogCreators);
	}

	@Override
	public void update(BlogCreators blogCreators) {
		blogCreatorsDao.save(blogCreators);	
	}

	@Override
	public void delete(BlogCreators blogCreators) {
		blogCreatorsDao.delete(blogCreators);
	}

	@Override
	public DataResult<List<BlogCreators>> getAll() {
		return new DataResult<List<BlogCreators>>(blogCreatorsDao.findAll(), true);
	}

	@Override
	public DataResult<BlogCreators> getById(int id) {
		return new DataResult<BlogCreators>(blogCreatorsDao.getById(id), true);
	}

}
