package com.cabby.heyCabby.services;

import com.cabby.heyCabby.dto.CabbyDto;
import com.cabby.heyCabby.dto.SignUpDto;
import com.cabby.heyCabby.dto.UserDto;

public interface AuthService {

    String login(String email, String password);
    UserDto signUp(SignUpDto signUpDto);

    CabbyDto onboardNewCabby(Long userId);


}
