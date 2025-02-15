package com.cabby.heyCabby.services.Implementation;

import com.cabby.heyCabby.dto.CabRequestDto;
import com.cabby.heyCabby.entities.Cabby;
import com.cabby.heyCabby.entities.Ride;
import com.cabby.heyCabby.entities.enums.RideStatus;
import com.cabby.heyCabby.services.RideService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImpl implements RideService {
    @Override
    public Ride getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDrivers(CabRequestDto cabRequestDto) {

    }

    @Override
    public Ride createNewRide(CabRequestDto cabRequestDto, Cabby cabby) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfPassenger(Long passengerId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfCabby(Long cabbyId, PageRequest pageRequest) {
        return null;
    }
}
