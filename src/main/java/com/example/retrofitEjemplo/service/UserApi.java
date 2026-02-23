package com.example.retrofitEjemplo.service;

import com.example.retrofitEjemplo.model.User;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface UserApi {
    @GET("/users")
    public Call<List<User>> fetchUsers();
}
