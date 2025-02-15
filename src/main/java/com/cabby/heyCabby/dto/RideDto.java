package com.cabby.heyCabby.dto;

import com.cabby.heyCabby.entities.Cabby;
import com.cabby.heyCabby.entities.Passenger;
import com.cabby.heyCabby.entities.enums.PaymentMethod;
import com.cabby.heyCabby.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideDto {

    private Long id;
    private Point pickUpLocation;
    private Point dropOffLocation;
    private PassengerDto passengerDto;
    private CabbyDto cabbyDto;
    private PaymentMethod paymentMethod;
    private RideStatus rideStatus;
    private Double fare;
    private LocalDateTime createdTime;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;

}
