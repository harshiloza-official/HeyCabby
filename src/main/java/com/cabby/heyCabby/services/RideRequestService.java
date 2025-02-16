package com.cabby.heyCabby.services;

import com.cabby.heyCabby.entities.CabRequest;

public interface RideRequestService {

    CabRequest findRideRequestById(Long rideRequestId);

    void update(CabRequest cabRequest);
}
