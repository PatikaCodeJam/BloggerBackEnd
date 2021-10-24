package com.blog_creaters.blog_creaters.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog_creaters.blog_creaters.entities.BlogCreators;

public interface BlogCreatorsDao extends JpaRepository<BlogCreators, Integer> {

}
