package com.cabby.heyCabby.services.Implementation;

import com.cabby.heyCabby.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceImpl implements DistanceService {
    @Override
    public double calculateDistance(Point src, Point dest) {
        //Need to call third party api OSRM to fetch the details.
        return 0;
    }
}
