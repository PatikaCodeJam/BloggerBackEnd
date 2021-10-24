package com.blogger.platform.business.concretes;

import com.blogger.platform.business.abstracts.BlogService;
import com.blogger.platform.core.utilities.results.DataResult;
import com.blogger.platform.core.utilities.results.Result;
import com.blogger.platform.core.utilities.results.SuccessDataResult;
import com.blogger.platform.core.utilities.results.SuccessResult;
import com.blogger.platform.dataAccess.abstracts.BlogDao;
import com.blogger.platform.entities.concretes.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogManager implements BlogService {
    private BlogDao blogDao;

    @Autowired
    public BlogManager(BlogDao blogDao) {
        super();
        this.blogDao = blogDao;
    }

    @Override
    public Result add(Blog blog) {
        this.blogDao.save(blog);
        return new SuccessResult("Blog added.");
    }

    @Override
    public Result delete(int blogId) {
        this.blogDao.deleteById(blogId);
        return new SuccessResult("Blog deleted.");
    }

    @Override
    public DataResult<List<Blog>> getAll() {
        return new SuccessDataResult<>(this.blogDao.findAll(), "Bloglar listelendi.");
    }

    @Override
    public DataResult<Blog> getById(int blogId) {
        return new SuccessDataResult<>(this.blogDao.getById(blogId), "Blog getirildi.");
    }

    @Override
    public DataResult<Blog> getByTitle(String title) {
        return new SuccessDataResult<>(this.blogDao.getByTitle(title));
    }

    @Override
    public DataResult<Blog> getByTitleAndCategory_CategoryId(String title, int categoryId) {
        return null;
    }

    @Override
    public DataResult<List<Blog>> getByCategoryIn(List<Integer> categories) {
        return null;
    }

    @Override
    public DataResult<List<Blog>> getByUserIn(List<Integer> users) {
        return null;
    }

    @Override
    public DataResult<List<Blog>> getByTitleOrCategory_CategoryId(String title, int categoryId) {
        return null;
    }
}
