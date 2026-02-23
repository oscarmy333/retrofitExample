package com.example.retrofitEjemplo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;


    public String toString() {
        return "User id=" + id + ", name=" + name + ", username=" + username + ", email=" + email
                + ", address=" + address.toString() + ", phone=" + phone + ", website=" + website
                + ", company=" + company.toString();
    }
}
