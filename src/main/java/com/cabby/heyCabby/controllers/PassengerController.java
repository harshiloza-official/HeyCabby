package com.cabby.heyCabby.controllers;

import com.cabby.heyCabby.dto.CabRequestDto;
import com.cabby.heyCabby.services.PassengerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passenger")
public class PassengerController {


    private final PassengerService passengerService;

    public PassengerController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    @PostMapping("/requestCab")
    public ResponseEntity<CabRequestDto> requestCab(@RequestBody CabRequestDto cabRequestDto){
        return ResponseEntity.ok(passengerService.requestRide(cabRequestDto));
    }

}
