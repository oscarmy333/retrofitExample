package com.example.retrofitEjemplo.service;

import com.example.retrofitEjemplo.model.Post;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface PostApi {
    @GET("/posts")
    public Call<List<Post>> fetchPosts();
}
