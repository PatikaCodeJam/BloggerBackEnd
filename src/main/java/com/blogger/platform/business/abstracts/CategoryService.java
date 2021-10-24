package com.blogger.platform.business.abstracts;

import com.blogger.platform.core.utilities.results.DataResult;
import com.blogger.platform.core.utilities.results.Result;
import com.blogger.platform.entities.concretes.Blog;
import com.blogger.platform.entities.concretes.Category;

import java.util.List;

public interface CategoryService {

    Result add(Category category);

    Result delete(int categoryId);

    DataResult<List<Category>> getAll();

    DataResult<Category> getById(int categoryId);

    DataResult<Category> getByCategoryName(String categoryName);
}
