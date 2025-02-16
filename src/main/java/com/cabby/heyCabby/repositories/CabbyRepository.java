package com.cabby.heyCabby.repositories;

import com.cabby.heyCabby.entities.Cabby;
import org.locationtech.jts.geom.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CabbyRepository extends JpaRepository<Cabby, Long> {
    @Query(value = "SELECT c.* , ST_Distance(c.current_location, :pickUpLocation) AS distance " +
            "FROM cabby AS c WHERE c.is_available = true AND ST_DWithin(c.current_location,  :pickUpLocation, 10000) " +
            "ORDER BY distance LIMIT 10", nativeQuery = true)
    List<Cabby> findNearestDrivers(Point pickUpLocation);
}
