package com.github.kurkov.springloginform.service;

/**
 * @author Aleksey Kurkov. Created on 28.06.2017
 */
public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
