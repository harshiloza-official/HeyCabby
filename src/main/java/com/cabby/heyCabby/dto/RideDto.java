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
public class RideDto {

    public RideDto(Long id, Point pickUpLocation, Point dropOffLocation, PassengerDto passengerDto, CabbyDto cabbyDto, PaymentMethod paymentMethod, RideStatus rideStatus, Double fare, String otp, LocalDateTime createdTime, LocalDateTime startedAt, LocalDateTime endedAt) {
        this.id = id;
        this.pickUpLocation = pickUpLocation;
        this.dropOffLocation = dropOffLocation;
        this.passengerDto = passengerDto;
        this.cabbyDto = cabbyDto;
        this.paymentMethod = paymentMethod;
        this.rideStatus = rideStatus;
        this.fare = fare;
        this.otp = otp;
        this.createdTime = createdTime;
        this.startedAt = startedAt;
        this.endedAt = endedAt;
    }

    public RideDto() {
    }

    private Long id;
    private Point pickUpLocation;
    private Point dropOffLocation;
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
