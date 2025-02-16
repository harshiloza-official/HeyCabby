package com.cabby.heyCabby.strategies.Implementation;
import com.cabby.heyCabby.entities.CabRequest;
import com.cabby.heyCabby.services.DistanceService;
import com.cabby.heyCabby.strategies.RideFareCalc;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class RideFareImpl implements RideFareCalc {

    private final DistanceService distanceService;


    public RideFareImpl(DistanceService distanceService) {
        this.distanceService = distanceService;
    }

    @Override
    public double calculateFare(CabRequest cabRequest) {
        double distance = distanceService.calculateDistance(cabRequest.getPickUpLocation(), cabRequest.getDropOffLocation());
        return distance*RIDE_FAIR_MULTIPLIER;
    }
}
