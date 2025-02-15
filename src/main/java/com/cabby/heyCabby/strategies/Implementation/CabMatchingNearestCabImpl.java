package com.cabby.heyCabby.strategies.Implementation;

import com.cabby.heyCabby.dto.CabRequestDto;
import com.cabby.heyCabby.entities.Cabby;
import com.cabby.heyCabby.strategies.CabMatching;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CabMatchingNearestCabImpl implements CabMatching {
    @Override
    public List<Cabby> findMatchingCabby(CabRequestDto cabRequestDto) {
        return List.of();
    }
}
