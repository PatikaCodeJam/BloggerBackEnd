package com.blogger.platform.api.controllers;

import com.blogger.platform.business.abstracts.CategoryService;
import com.blogger.platform.core.utilities.results.DataResult;
import com.blogger.platform.core.utilities.results.Result;
import com.blogger.platform.entities.concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/categories/")
public class CategoriesController {
    private CategoryService categoryService;

    @Autowired
    public CategoriesController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("add")
    public Result add(@RequestBody Category category) {
        return this.categoryService.add(category);
    }

    @PostMapping("delete")
    public Result delete(@RequestParam int categoryId) {
        return this.categoryService.delete(categoryId);
    }

    @GetMapping("getAll")
    public DataResult<List<Category>> getAll() {
        return this.categoryService.getAll();
    }

    @GetMapping("getById")
    public DataResult<Category> getById(@RequestParam int categoryId) {
        return this.categoryService.getById(categoryId);
    }

    @GetMapping("getByCategoryName")
    public DataResult<Category> getByCategoryName(@RequestParam String categoryName) {
        return this.categoryService.getByCategoryName(categoryName);
    }

}
