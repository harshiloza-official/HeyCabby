package com.cabby.heyCabby.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.ConnectionBuilder;

@Entity
public class Passenger {
    public Passenger() {
    }

    public Passenger(Long id, User user, Double rating) {
        this.id = id;
        this.user = user;
        this.rating = rating;
    }
    private Passenger(Builder builder) {
        this.id = builder.id;
        this.user = builder.user;
        this.rating = builder.rating;
    }

    public static class Builder {
        private Long id;
        private User user;
        private Double rating;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder setRating(Double rating) {
            this.rating = rating;
            return this;
        }

        public Passenger build() {
            return new Passenger(this);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Double rating;
}
