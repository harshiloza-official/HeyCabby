package com.cabby.heyCabby.controllers;

import com.cabby.heyCabby.dto.RideDto;
import com.cabby.heyCabby.dto.RideStartDto;
import com.cabby.heyCabby.services.CabbyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cabbies")
public class CabbyController {

    private final CabbyService cabbyService;
    @PostMapping("/acceptRide/{rideRequestId}")
    public ResponseEntity<RideDto> acceptRide(@PathVariable Long rideRequestId){
        return ResponseEntity.ok(cabbyService.acceptRide(rideRequestId));
    }

    @PostMapping("/startRide/{rideRequestId}")
    public ResponseEntity<RideDto> startRide(@PathVariable Long rideRequestId, @RequestBody RideStartDto rideStartDto){
        return ResponseEntity.ok(cabbyService.startRide(rideRequestId, rideStartDto.getOtp()));
    }


}
