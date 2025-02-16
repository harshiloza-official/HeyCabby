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
public class CabRequestDto {

 public CabRequestDto(Long id, PointDto pickUpLocation, PointDto dropOffLocation, LocalDateTime requestedTime, PaymentMethod paymentMethod, CabRequestStatus cabRequestStatus, PassengerDto passengerDto) {
  this.id = id;
  this.pickUpLocation = pickUpLocation;
  this.dropOffLocation = dropOffLocation;
  this.requestedTime = requestedTime;
  this.paymentMethod = paymentMethod;
  this.cabRequestStatus = cabRequestStatus;
  this.passengerDto = passengerDto;
 }

 public CabRequestDto() {
 }

 private Long id;
    private PointDto pickUpLocation;
    private PointDto dropOffLocation;
    private LocalDateTime requestedTime;
    private PaymentMethod paymentMethod;
    private CabRequestStatus cabRequestStatus;
    private PassengerDto passengerDto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PointDto getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(PointDto pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public PointDto getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(PointDto dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public LocalDateTime getRequestedTime() {
        return requestedTime;
    }

    public void setRequestedTime(LocalDateTime requestedTime) {
        this.requestedTime = requestedTime;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public CabRequestStatus getCabRequestStatus() {
        return cabRequestStatus;
    }

    public void setCabRequestStatus(CabRequestStatus cabRequestStatus) {
        this.cabRequestStatus = cabRequestStatus;
    }

    public PassengerDto getPassengerDto() {
        return passengerDto;
    }

    public void setPassengerDto(PassengerDto passengerDto) {
        this.passengerDto = passengerDto;
    }
}
