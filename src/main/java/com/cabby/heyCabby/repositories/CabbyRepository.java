package com.cabby.heyCabby.repositories;

import com.cabby.heyCabby.entities.Cabby;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabbyRepository extends JpaRepository<Cabby, Long> {
}
