package com.blogger.platform.business.abstracts;

import com.blogger.platform.core.utilities.results.DataResult;
import com.blogger.platform.core.utilities.results.Result;
import com.blogger.platform.entities.concretes.User;

import java.util.List;

public interface UserService {
    Result add(User user);

    Result addFollower(User user);

    Result delete(int userId);

    DataResult<List<User>> getAll();

    DataResult<User> getById(int userId);

    DataResult<User> getByUserName(String userName);

    DataResult<User> getByEmail(String email);

}
