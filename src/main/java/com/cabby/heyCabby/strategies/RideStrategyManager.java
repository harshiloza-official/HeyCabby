package com.cabby.heyCabby.strategies;

import com.cabby.heyCabby.strategies.Implementation.CabMatchingHighestRatedCabbyImpl;
import com.cabby.heyCabby.strategies.Implementation.CabMatchingNearestCabImpl;
import com.cabby.heyCabby.strategies.Implementation.RideFareSurgeRisingCalcImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@RequiredArgsConstructor
public class RideStrategyManager {

    private final CabMatchingHighestRatedCabbyImpl highestRatedCabby;
    private final CabMatchingNearestCabImpl nearestCab;
    private final RideFareCalc rideFareCalc;
    private final RideFareSurgeRisingCalcImpl rideFareSurgeRisingCalc;
    public CabMatching cabMatching(double passengerRating) {
        if(passengerRating >= 4.8){
            return highestRatedCabby;
        } else {
            return nearestCab;
        }
    }

    public RideFareCalc rideFareCalc(){

        LocalTime surgeStartTime = LocalTime.of(18, 0);
        LocalTime surgeEndTime = LocalTime.of(21, 0);
        LocalTime currentTime = LocalTime.now();
        boolean isSurgeTime = currentTime.isAfter(surgeStartTime) && currentTime.isBefore(surgeEndTime);
        if(isSurgeTime){
            return rideFareSurgeRisingCalc;
        }
        return rideFareCalc;

    }
}
