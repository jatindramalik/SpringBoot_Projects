package com.jua.springbootlogin.service;

import com.jua.springbootlogin.model.User;
import com.jua.springbootlogin.web.dto.UserRegistrationDto;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{

    User save(UserRegistrationDto registrationDto);
    
}
