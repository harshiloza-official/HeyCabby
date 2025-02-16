package com.cabby.heyCabby.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class PassengerDto {

    public PassengerDto(UserDto user, double rating) {
        this.user = user;
        this.rating = rating;
    }

    public PassengerDto() {
    }

    private UserDto user;
    private double rating;
}
