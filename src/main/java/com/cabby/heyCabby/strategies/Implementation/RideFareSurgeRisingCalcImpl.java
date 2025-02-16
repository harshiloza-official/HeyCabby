package com.cabby.heyCabby.strategies.Implementation;

import com.cabby.heyCabby.entities.CabRequest;
import com.cabby.heyCabby.services.DistanceService;
import com.cabby.heyCabby.strategies.RideFareCalc;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RideFareSurgeRisingCalcImpl implements RideFareCalc {

    private final DistanceService distanceService;
    private static final double SURGE_FACTOR = 2;
    @Override
    public double calculateFare(CabRequest cabRequest) {
        double distance = distanceService.calculateDistance(cabRequest.getPickUpLocation(), cabRequest.getDropOffLocation());
        return distance*RIDE_FAIR_MULTIPLIER*SURGE_FACTOR;
    }
}
