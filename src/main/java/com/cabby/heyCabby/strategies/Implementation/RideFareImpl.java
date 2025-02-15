package com.cabby.heyCabby.strategies.Implementation;

import com.cabby.heyCabby.dto.CabRequestDto;
import com.cabby.heyCabby.strategies.RideFareCalc;
import org.springframework.stereotype.Service;

@Service
public class RideFareImpl implements RideFareCalc {

    @Override
    public double calculateFare(CabRequestDto cabRequestDto) {
        return 0;
    }
}
