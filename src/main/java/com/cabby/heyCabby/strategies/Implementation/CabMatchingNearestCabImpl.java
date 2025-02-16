package com.cabby.heyCabby.strategies.Implementation;

import com.cabby.heyCabby.entities.CabRequest;
import com.cabby.heyCabby.entities.Cabby;
import com.cabby.heyCabby.repositories.CabbyRepository;
import com.cabby.heyCabby.strategies.CabMatching;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;


@Primary
@Service
@RequiredArgsConstructor
public class CabMatchingNearestCabImpl implements CabMatching {

    private final CabbyRepository cabbyRepository;
    @Override
    public List<Cabby> findMatchingCabby(CabRequest cabRequest) {
        return cabbyRepository.findNearestDrivers(cabRequest.getPickUpLocation() );

    }
}
