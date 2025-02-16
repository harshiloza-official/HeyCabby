package com.cabby.heyCabby.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

@Entity
@Getter
@Setter
public class Cabby {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "")
    private User user;

    private Double rating;

    private Boolean isAvailable;

    private String vehicleId;
    @Column(columnDefinition = "Geometry(Point, 4326)")     //4326 means earth geometry
    Point currentLocation;

    public void setId(Long id) {
        this.id = id;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setCurrentLocation(Point currentLocation) {
        this.currentLocation = currentLocation;
    }
}
