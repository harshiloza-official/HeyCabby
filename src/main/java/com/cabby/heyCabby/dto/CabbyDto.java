package com.cabby.heyCabby.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CabbyDto {

    private UserDto user;
    private double rating;


}
