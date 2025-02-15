package com.cabby.heyCabby.services;

import com.cabby.heyCabby.dto.CabRequestDto;
import com.cabby.heyCabby.entities.Cabby;
import com.cabby.heyCabby.entities.Ride;
import com.cabby.heyCabby.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);
    void matchWithDrivers(CabRequestDto cabRequestDto);
    Ride createNewRide(CabRequestDto cabRequestDto, Cabby cabby);
    Ride updateRideStatus(Long rideId, RideStatus rideStatus);
    Page<Ride> getAllRidesOfPassenger(Long passengerId, PageRequest pageRequest);
    Page<Ride> getAllRidesOfCabby(Long cabbyId, PageRequest pageRequest);

}
