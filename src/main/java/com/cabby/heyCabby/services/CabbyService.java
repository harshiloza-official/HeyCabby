package com.cabby.heyCabby.services;

import com.cabby.heyCabby.dto.PassengerDto;
import com.cabby.heyCabby.dto.RideDto;
import com.cabby.heyCabby.entities.Cabby;

import java.util.List;

public interface CabbyService {

    RideDto acceptRide(Long rideRequestId);
    RideDto cancelRide(Long rideId);
    RideDto startRide(Long rideId, String otp);
    RideDto endRide(Long rideId);
    PassengerDto ratePassenger(Long rideId, Integer rating);
    PassengerDto getMyProfile();
    List<RideDto> getMyAllRides();

    Cabby getCurrentCabby();
}
