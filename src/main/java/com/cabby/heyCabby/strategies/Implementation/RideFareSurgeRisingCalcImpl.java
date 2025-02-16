package com.cabby.heyCabby.strategies.Implementation;

import com.cabby.heyCabby.dto.CabRequestDto;
import com.cabby.heyCabby.entities.CabRequest;
import com.cabby.heyCabby.strategies.RideFareCalc;
import org.springframework.stereotype.Service;

@Service
public class RideFareSurgeRisingCalcImpl implements RideFareCalc {
    @Override
    public double calculateFare(CabRequest cabRequest) {
        return 0;
    }
}
