package com.blogger.platform.business.concretes;

import com.blogger.platform.core.utilities.results.SuccessDataResult;
import com.blogger.platform.business.abstracts.UserService;
import com.blogger.platform.core.utilities.results.DataResult;
import com.blogger.platform.core.utilities.results.Result;
import com.blogger.platform.core.utilities.results.SuccessResult;
import com.blogger.platform.dataAccess.abstracts.UserDao;
import com.blogger.platform.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("User added.");
    }

    @Override
    public Result delete(User user) {
        this.userDao.delete(user);
        return new SuccessResult("User deleted.");
    }

    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult<>(this.userDao.findAll(), "Data listed.");
    }

    @Override
    public DataResult<User> getByUserId(int userId) {
        return new SuccessDataResult<>(this.userDao.getByUserId(userId), "Data listed.");
    }

    @Override
    public DataResult<User> getByUserName(String userName) {
        return new SuccessDataResult<>(this.userDao.getByUserName(userName), "Data listed.");
    }

    @Override
    public DataResult<User> getByEmail(String email) {
        return new SuccessDataResult<>(this.userDao.getByEmail(email), "Data listed.");
    }

}
