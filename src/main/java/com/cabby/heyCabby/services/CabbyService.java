package com.cabby.heyCabby.services;

import com.cabby.heyCabby.dto.PassengerDto;
import com.cabby.heyCabby.dto.RideDto;

import java.util.List;

public interface CabbyService {

    RideDto acceptRide(Long rideId);
    RideDto cancelRide(Long rideId);
    RideDto startRide(Long rideId);
    RideDto endRide(Long rideId);
    PassengerDto ratePassenger(Long rideId, Integer rating);
    PassengerDto getMyProfile();
    List<RideDto> getMyAllRides();


}
