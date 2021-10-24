package com.blogger.platform.business.abstracts;

import com.blogger.platform.core.utilities.results.DataResult;
import com.blogger.platform.core.utilities.results.Result;
import com.blogger.platform.entities.concretes.Blog;

import java.util.List;

public interface BlogService {

    Result add(Blog blog);

    Result delete(int blogId);

    DataResult<List<Blog>> getAll();

    DataResult<Blog> getById(int blogId);

    DataResult<Blog> getByTitle(String title);

    DataResult<Blog> getByTitleAndCategory_CategoryId(String title, int categoryId);

    DataResult<List<Blog>> getByCategoryIn(List<Integer> categories);

    DataResult<List<Blog>> getByUserIn(List<Integer> users);

    DataResult<List<Blog>> getByTitleOrCategory_CategoryId(String title, int categoryId);
}
