package com.bloggers.bloggers.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloggers.bloggers.entities.concretes.UserFollowers;

public interface UserFollowersDao extends JpaRepository<UserFollowers, Integer> {

}
