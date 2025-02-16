package com.cabby.heyCabby.dto;

import lombok.Data;

@Data
public class PointDto {

    private double[] coordinates;
    private String type = "Point";

    public double[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PointDto(double[] coordinates) {
        this.coordinates = coordinates;
    }

    public PointDto() {
    }
}
