package com.cabby.heyCabby.strategies;

import com.cabby.heyCabby.dto.CabRequestDto;

public interface RideFareCalc {
    double calculateFare(CabRequestDto cabRequestDto);
}
