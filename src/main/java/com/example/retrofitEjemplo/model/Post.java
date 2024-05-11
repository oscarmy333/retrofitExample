package com.example.retrofitEjemplo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;


    public String toString(){
        return "Post id="+id+", userId"+userId;
    }
}
