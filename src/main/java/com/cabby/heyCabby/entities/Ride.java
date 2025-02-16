package com.cabby.heyCabby.entities;

import com.cabby.heyCabby.entities.enums.PaymentMethod;
import com.cabby.heyCabby.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point pickUpLocation;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point dropOffLocation;
    @ManyToOne(fetch = FetchType.LAZY)
    private Passenger passenger;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cabby cabby;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;


    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;

    private Double fare;
    private String otp;
    @CreationTimestamp
    private LocalDateTime createdTime;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;

}
