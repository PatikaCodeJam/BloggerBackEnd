package com.blogger.platform.dataAccess.abstracts;

import com.blogger.platform.entities.concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {

    Category getByCategoryName(String categoryName);
}
