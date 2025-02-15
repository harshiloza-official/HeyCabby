package com.cabby.heyCabby.services.Implementation;

import com.cabby.heyCabby.dto.CabbyDto;
import com.cabby.heyCabby.dto.SignUpDto;
import com.cabby.heyCabby.dto.UserDto;
import com.cabby.heyCabby.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signUp(SignUpDto signUpDto) {
        return null;
    }

    @Override
    public CabbyDto onboardNewCabby(Long userId) {
        return null;
    }
}
