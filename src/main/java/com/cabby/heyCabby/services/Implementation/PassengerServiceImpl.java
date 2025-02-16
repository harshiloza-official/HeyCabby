package com.cabby.heyCabby.services.Implementation;

import com.cabby.heyCabby.dto.CabRequestDto;
import com.cabby.heyCabby.dto.CabbyDto;
import com.cabby.heyCabby.dto.PassengerDto;
import com.cabby.heyCabby.dto.RideDto;
import com.cabby.heyCabby.entities.CabRequest;
import com.cabby.heyCabby.entities.Cabby;
import com.cabby.heyCabby.entities.Passenger;
import com.cabby.heyCabby.entities.User;
import com.cabby.heyCabby.entities.enums.CabRequestStatus;
import com.cabby.heyCabby.exceptions.ResourceNotFoundException;
import com.cabby.heyCabby.repositories.CabRequestRepository;
import com.cabby.heyCabby.repositories.PassengerRepository;
import com.cabby.heyCabby.services.PassengerService;
import com.cabby.heyCabby.strategies.RideStrategyManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PassengerServiceImpl implements PassengerService {

    private final ModelMapper modelMapper;
    private final RideStrategyManager rideStrategyManager;
    private final CabRequestRepository cabRequestRepository;
    private final PassengerRepository passengerRepository;

    @Override
    @Transactional
    public CabRequestDto requestRide(CabRequestDto cabRequestDto) {
        Passenger passenger = getCurrentPassenger();

        CabRequest cabRequest = modelMapper.map(cabRequestDto, CabRequest.class);

        cabRequest.setCabRequestStatus(CabRequestStatus.PENDING);
        cabRequest.setPassenger(passenger);

        Double fare = rideStrategyManager.rideFareCalc().calculateFare(cabRequest);
        cabRequest.setFare(fare);

        CabRequest saveCabRequest = cabRequestRepository.save(cabRequest);

        List<Cabby> cabbyList = rideStrategyManager.cabMatching(passenger.getRating()).findMatchingCabby(cabRequest);
        //Need to send notification to cabbyList
        return modelMapper.map(saveCabRequest, CabRequestDto.class);
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public CabbyDto rateCabby(Long rideId, Integer rating) {
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
    public Passenger createNewPassenger(User user) {
        Passenger passenger = new Passenger.Builder().setUser(user).setRating(0.0).build();
        return passengerRepository.save(passenger);
    }

    @Override
    public Passenger getCurrentPassenger() {
        //Need to Implement Spring Security to get Actual Passenger Data
        return passengerRepository.findById(1L).orElseThrow(() -> new ResourceNotFoundException("Passenger not found with ID 1"));
    }
}
