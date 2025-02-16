package com.cabby.heyCabby.controllers;

import com.cabby.heyCabby.dto.SignUpDto;
import com.cabby.heyCabby.dto.UserDto;
import com.cabby.heyCabby.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    UserDto signUp(@RequestBody SignUpDto signUpDto){
        return authService.signUp(signUpDto);
    }

}
