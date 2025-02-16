package com.cabby.heyCabby.entities;

import com.cabby.heyCabby.entities.enums.PaymentMethod;
import com.cabby.heyCabby.entities.enums.PaymentStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @OneToOne(fetch = FetchType.LAZY)
    private Ride ride;

    private Double amount;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @CreationTimestamp
    private LocalDateTime paymentTime;

    public Payment(Long id, PaymentMethod paymentMethod, Ride ride, Double amount, PaymentStatus paymentStatus, LocalDateTime paymentTime) {
        this.id = id;
        this.paymentMethod = paymentMethod;
        this.ride = ride;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
        this.paymentTime = paymentTime;
    }

    public Payment() {
    }
}
