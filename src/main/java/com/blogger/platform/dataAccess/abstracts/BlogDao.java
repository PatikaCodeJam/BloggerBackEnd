package com.blogger.platform.dataAccess.abstracts;

import com.blogger.platform.entities.concretes.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogDao extends JpaRepository<Blog, Integer> {
    Blog getByTitle(String title);

    Blog getByTitleAndCategory_CategoryId(String title, int categoryId);

    List<Blog> getByCategoryIn(List<Integer> categories);

    List<Blog> getByUserIn(List<Integer> users);

    List<Blog> getByTitleOrCategory_CategoryId(String title, int categoryId);
}
