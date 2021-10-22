package com.blogger.platform.dataAccess.abstracts;

import com.blogger.platform.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

    User getByUserId(int userId);

    User getByUserName(String userName);

    User getByEmail(String email);
}
