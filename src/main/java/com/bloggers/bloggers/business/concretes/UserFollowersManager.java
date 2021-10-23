package com.bloggers.bloggers.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloggers.bloggers.business.abstracts.UsersFollowersService;
import com.bloggers.bloggers.core.utilities.results.DataResult;
import com.bloggers.bloggers.core.utilities.results.SuccessDataResult;
import com.bloggers.bloggers.dataAccess.abstracts.UserFollowersDao;
import com.bloggers.bloggers.entities.concretes.UserFollowers;

@Service
public class UserFollowersManager implements UsersFollowersService {

	private UserFollowersDao userFollowersDao;

	@Autowired
	public UserFollowersManager(UserFollowersDao userFollowersDao) {
		this.userFollowersDao = userFollowersDao;
	}
	
	@Override
	public void add(UserFollowers userFollowers) {
		userFollowersDao.save(userFollowers);
	}

	@Override
	public void update(UserFollowers userFollowers) {
		userFollowersDao.save(userFollowers);
	}

	@Override
	public void delete(UserFollowers userFollowers) {
		userFollowersDao.delete(userFollowers);
	}

	@Override
	public DataResult<List<UserFollowers>> getAll() {
		return new SuccessDataResult<>(this.userFollowersDao.findAll(),"Datas listed.");
	}
	
}
