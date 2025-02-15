package com.cabby.heyCabby.strategies;

import com.cabby.heyCabby.dto.CabRequestDto;
import com.cabby.heyCabby.entities.Cabby;

import java.util.List;

public interface CabMatching {

    List<Cabby> findMatchingCabby(CabRequestDto cabRequestDto);

}
