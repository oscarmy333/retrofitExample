package com.example.retrofitEjemplo.controller;

import com.example.retrofitEjemplo.model.Post;
import com.example.retrofitEjemplo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> fetchPosts(){
        return postService.fetchPost();
    }

    @GetMapping("{id}")
    public ResponseEntity<Post> getPost(@PathVariable("id") int id){
        return ResponseEntity.ok(postService.getPost(id));
    }

}
