package com.app.app_security_app.application.services;

import java.util.List;

import com.app.app_security_app.domain.entity.User;

public interface IUserService {
    List<User> findAll();
    User save(User user);
    boolean existsByUsername(String username);
}
