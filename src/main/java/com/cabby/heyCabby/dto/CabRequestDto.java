package com.cabby.heyCabby.dto;

import com.cabby.heyCabby.entities.Passenger;
import com.cabby.heyCabby.entities.enums.CabRequestStatus;
import com.cabby.heyCabby.entities.enums.PaymentMethod;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CabRequestDto {

   private Long id;
    private Point pickUpLocation;
    private Point dropOffLocation;
    private LocalDateTime requestedTime;
    private PassengerDto passengerDto;
    private PaymentMethod paymentMethod;
    private CabRequestStatus cabRequestStatus;

}
