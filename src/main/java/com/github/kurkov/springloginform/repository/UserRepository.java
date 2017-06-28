package com.github.kurkov.springloginform.repository;

import com.github.kurkov.springloginform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Aleksey Kurkov. Created on 28.06.2017
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
