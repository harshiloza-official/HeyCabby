package com.cabby.heyCabby.services.Implementation;

import com.cabby.heyCabby.dto.CabRequestDto;
import com.cabby.heyCabby.entities.CabRequest;
import com.cabby.heyCabby.entities.Cabby;
import com.cabby.heyCabby.entities.Ride;
import com.cabby.heyCabby.entities.enums.CabRequestStatus;
import com.cabby.heyCabby.entities.enums.RideStatus;
import com.cabby.heyCabby.exceptions.ResourceNotFoundException;
import com.cabby.heyCabby.repositories.RideRepository;
import com.cabby.heyCabby.services.RideRequestService;
import com.cabby.heyCabby.services.RideService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class RideServiceImpl implements RideService {

    private final RideRepository rideRepository;
    private final RideRequestService rideRequestService;
    private final ModelMapper modelMapper;
    @Override
    public Ride getRideById(Long rideId) {

        return rideRepository.findById(rideId).orElseThrow(()-> new ResourceNotFoundException("Ride not found with id "+rideId));
    }

    @Override
    public void matchWithDrivers(CabRequestDto cabRequestDto) {

    }

    @Override
    public Ride createNewRide(CabRequest cabRequest, Cabby cabby) {

        cabRequest.setCabRequestStatus(CabRequestStatus.CONFIRMED);
        Ride ride = modelMapper.map(cabRequest, Ride.class);
        ride.setRideStatus(RideStatus.CONFIRMED);
        ride.setCabby(cabby);
        ride.setOtp(generateRandomOTP());
        ride.setId(null);
        rideRequestService.update(cabRequest);
        return rideRepository.save(ride);
    }

    @Override
    public Ride updateRideStatus(Ride ride, RideStatus rideStatus) {

        ride.setRideStatus(rideStatus);
        return rideRepository.save(ride);
    }

    @Override
    public Page<Ride> getAllRidesOfPassenger(Long passengerId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfCabby(Long cabbyId, PageRequest pageRequest) {
        return null;
    }

    private String generateRandomOTP(){
        Random random = new Random();
        int otp = random.nextInt(10000); // Will give 0 to 9999
        return String.format("%04d", otp);
    }
}
