package com.sangamone.springboot.service;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public boolean validateUser(String userid, String password) {

        return userid.equalsIgnoreCase("abhijith")
                && password.equalsIgnoreCase("password");
    }
}

