package com.github.kurkov.springloginform.repository;

import com.github.kurkov.springloginform.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Aleksey Kurkov. Created on 28.06.2017
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
    
}
