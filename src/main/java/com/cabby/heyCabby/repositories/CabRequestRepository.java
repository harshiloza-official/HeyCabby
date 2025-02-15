package com.cabby.heyCabby.repositories;

import com.cabby.heyCabby.entities.CabRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabRequestRepository extends JpaRepository<CabRequest, Long> {
}
