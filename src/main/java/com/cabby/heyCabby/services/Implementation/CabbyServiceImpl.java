package com.cabby.heyCabby.services.Implementation;

import com.cabby.heyCabby.dto.PassengerDto;
import com.cabby.heyCabby.dto.RideDto;
import com.cabby.heyCabby.entities.CabRequest;
import com.cabby.heyCabby.entities.Cabby;
import com.cabby.heyCabby.entities.Ride;
import com.cabby.heyCabby.entities.enums.CabRequestStatus;
import com.cabby.heyCabby.entities.enums.RideStatus;
import com.cabby.heyCabby.exceptions.ResourceNotFoundException;
import com.cabby.heyCabby.repositories.CabbyRepository;
import com.cabby.heyCabby.services.CabbyService;
import com.cabby.heyCabby.services.RideRequestService;
import com.cabby.heyCabby.services.RideService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CabbyServiceImpl implements CabbyService {

    private final RideRequestService rideRequestService;
    private final CabbyRepository cabbyRepository;
    private final RideService rideService;
    private final ModelMapper modelMapper;
    @Override
    @Transactional
    public RideDto acceptRide(Long rideRequestId) {

        CabRequest cabRequest = rideRequestService.findRideRequestById(rideRequestId);
        if(!cabRequest.getCabRequestStatus().equals(CabRequestStatus.PENDING)){
            throw new RuntimeException("RideRequest Cannot be Accepted, status is "+cabRequest.getCabRequestStatus());
        }

        Cabby currentCabby = getCurrentCabby();
        if(!currentCabby.getIsAvailable()){
            throw new RuntimeException("Cabby Cannot accept ride due to unavailability");
        }
        currentCabby.setAvailable(false);
        Cabby savedCabby = cabbyRepository.save(currentCabby);

        Ride ride = rideService.createNewRide(cabRequest, savedCabby);

        return modelMapper.map(ride, RideDto.class);
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto startRide(Long rideId, String otp) {
        Ride ride = rideService.getRideById(rideId);
        Cabby cabby = getCurrentCabby();

        if(!cabby.equals(ride.getCabby())){
            throw new RuntimeException("Driver cannot start a ride as the individual has not accepted it earlier");
        }

        if(!ride.getRideStatus().equals(RideStatus.CONFIRMED)){
            throw new RuntimeException("Ride status is not CONFIRMED hence cannot be started, status:"+ride.getRideStatus());
        }

        if(!otp.equals(ride.getOtp())){
            throw new RuntimeException("Invalid OTP: "+otp);
        }

        ride.setStartedAt(LocalDateTime.now());
        Ride saveRide = rideService.updateRideStatus(ride, RideStatus.ONGOING);
        return modelMapper.map(saveRide, RideDto.class);

    }

    @Override
    public RideDto endRide(Long rideId) {
        return null;
    }

    @Override
    public PassengerDto ratePassenger(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public PassengerDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getMyAllRides() {
        return null;
    }

    @Override
    public Cabby getCurrentCabby() {
        return cabbyRepository.findById(2L).orElseThrow(() -> new ResourceNotFoundException("Driver not found with id: "+2));
    }
}
