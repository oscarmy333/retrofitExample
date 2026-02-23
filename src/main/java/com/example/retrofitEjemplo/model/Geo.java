package com.example.retrofitEjemplo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Geo {
    private String lat;
    private String lng;

    public String toString() {
        return "Geo lat=" + lat + ", lng=" + lng;
    }
}
