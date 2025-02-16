package com.cabby.heyCabby.strategies;

import com.cabby.heyCabby.entities.CabRequest;

public interface RideFareCalc {
    static final double RIDE_FAIR_MULTIPLIER = 10;
    double calculateFare(CabRequest cabRequest);
}
