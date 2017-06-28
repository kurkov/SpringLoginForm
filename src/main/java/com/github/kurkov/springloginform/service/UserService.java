package com.github.kurkov.springloginform.service;

import com.github.kurkov.springloginform.model.User;

/**
 * @author Aleksey Kurkov. Created on 28.06.2017
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
