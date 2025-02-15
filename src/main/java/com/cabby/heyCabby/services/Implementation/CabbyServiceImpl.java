package com.cabby.heyCabby.services.Implementation;

import com.cabby.heyCabby.dto.PassengerDto;
import com.cabby.heyCabby.dto.RideDto;
import com.cabby.heyCabby.services.CabbyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CabbyServiceImpl implements CabbyService {
    @Override
    public RideDto acceptRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto startRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto endRide(Long rideId) {
        return null;
    }

    @Override
    public PassengerDto ratePassenger(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public PassengerDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getMyAllRides() {
        return null;
    }
}
