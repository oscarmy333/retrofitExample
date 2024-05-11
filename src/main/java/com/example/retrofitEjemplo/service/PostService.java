package com.example.retrofitEjemplo.service;

import com.example.retrofitEjemplo.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    public List<Post> fetchPost();

    public Post getPost(int id);
}
