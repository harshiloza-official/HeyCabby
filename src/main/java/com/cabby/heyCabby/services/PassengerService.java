package com.cabby.heyCabby.services;

import com.cabby.heyCabby.dto.CabRequestDto;
import com.cabby.heyCabby.dto.CabbyDto;
import com.cabby.heyCabby.dto.PassengerDto;
import com.cabby.heyCabby.dto.RideDto;
import com.cabby.heyCabby.entities.CabRequest;

import java.util.List;

public interface PassengerService {

    CabRequestDto requestRide(CabRequestDto cabRequestDto);
    RideDto cancelRide(Long rideId);
    CabbyDto rateCabby(Long rideId, Integer rating);
    PassengerDto getMyProfile();
    List<RideDto> getMyAllRides();

}
