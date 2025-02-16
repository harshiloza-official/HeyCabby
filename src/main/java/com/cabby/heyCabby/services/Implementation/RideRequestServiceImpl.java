package com.cabby.heyCabby.services.Implementation;

import com.cabby.heyCabby.entities.CabRequest;
import com.cabby.heyCabby.exceptions.ResourceNotFoundException;
import com.cabby.heyCabby.repositories.CabRequestRepository;
import com.cabby.heyCabby.services.RideRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RideRequestServiceImpl implements RideRequestService {

    private final CabRequestRepository cabRequestRepository;
    @Override
    public CabRequest findRideRequestById(Long rideRequestId) {
        return cabRequestRepository.findById(rideRequestId).orElseThrow(() -> new ResourceNotFoundException("RideRequest not found with id: "+rideRequestId));
    }

    @Override
    public void update(CabRequest cabRequest) {
        cabRequestRepository.findById(cabRequest.getId()).orElseThrow(()-> new ResourceNotFoundException("CabRequest not found with id: "+cabRequest.getId()));
        cabRequestRepository.save(cabRequest);
    }
}
