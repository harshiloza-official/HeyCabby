package com.cabby.heyCabby.dto;

import com.cabby.heyCabby.entities.enums.Role;
import lombok.Data;

import java.util.Set;

@Data
public class UserDto {

    public UserDto(String name, String email, Set<Role> roles) {
        this.name = name;
        this.email = email;
        this.roles = roles;
    }

    public UserDto() {
    }

    private String name;
    private String email;
    private Set<Role> roles;

}
