package com.cabby.heyCabby.dto;

import com.cabby.heyCabby.entities.enums.PaymentMethod;
import com.cabby.heyCabby.entities.enums.RideStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
public class RideDto {

    private Long id;
    private PointDto pickUpLocation;
    private PointDto dropOffLocation;
    private PassengerDto passengerDto;
    private CabbyDto cabbyDto;
    private PaymentMethod paymentMethod;
    private RideStatus rideStatus;
    private Double fare;
    private String otp;
    private LocalDateTime createdTime;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;

}
