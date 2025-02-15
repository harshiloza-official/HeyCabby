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

    @Column(columnDefinition = "Geometry(Point, 4326)")     //4326 means earth geometry
    Point currentLocation;

}
