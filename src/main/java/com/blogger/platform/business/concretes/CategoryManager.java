package com.blogger.platform.business.concretes;

import com.blogger.platform.business.abstracts.CategoryService;
import com.blogger.platform.core.utilities.results.DataResult;
import com.blogger.platform.core.utilities.results.Result;
import com.blogger.platform.core.utilities.results.SuccessDataResult;
import com.blogger.platform.core.utilities.results.SuccessResult;
import com.blogger.platform.dataAccess.abstracts.CategoryDao;
import com.blogger.platform.entities.concretes.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryManager implements CategoryService {
    private CategoryDao categoryDao;

    public CategoryManager(CategoryDao categoryDao) {
        super();
        this.categoryDao = categoryDao;
    }

    @Override
    public Result add(Category category) {
        this.categoryDao.save(category);
        return new SuccessResult("Category added.");
    }

    @Override
    public Result delete(int categoryId) {
        this.categoryDao.deleteById(categoryId);
        return new SuccessResult("Category deleted.");
    }

    @Override
    public DataResult<List<Category>> getAll() {
        return new SuccessDataResult<>(this.categoryDao.findAll(), "Categories listed.");
    }

    @Override
    public DataResult<Category> getById(int categoryId) {
        return new SuccessDataResult<>(this.categoryDao.getById(categoryId), "Category");
    }

    @Override
    public DataResult<Category> getByCategoryName(String categoryName) {
        return new SuccessDataResult<>(this.categoryDao.getByCategoryName(categoryName));
    }
}
