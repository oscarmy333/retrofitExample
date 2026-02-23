package com.example.retrofitEjemplo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;


    public String toString() {
        return "Address street=" + street + ", suite=" + suite + ", city=" + city + ", zipcode=" + zipcode
                + geo.toString();
    }
}
