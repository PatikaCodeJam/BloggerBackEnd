package com.bloggers.bloggers.business.abstracts;

import java.util.List;

import com.bloggers.bloggers.core.utilities.results.DataResult;
import com.bloggers.bloggers.entities.concretes.UserFollowers;

public interface UsersFollowersService {
	
	DataResult<List<UserFollowers>> getAll();
	public void add(UserFollowers userFollowers);
	public void update(UserFollowers userFollowers);
	public void delete(UserFollowers userFollowers);
	
}
