package com.example.retrofitEjemplo.service.impl;

import com.example.retrofitEjemplo.model.Post;
import com.example.retrofitEjemplo.service.PostApi;
import com.example.retrofitEjemplo.service.PostService;
import com.example.retrofitEjemplo.util.RetrofitUtil;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class PostServiceImpl implements PostService {
    private PostApi postApi;
    private Retrofit retrofit;

    public PostServiceImpl(){
        this.retrofit = RetrofitUtil.getRetrofitInstance();
        this.postApi = retrofit.create(PostApi.class);
    }

    @Override
    public List<Post> fetchPost() {
        List<Post> posts = new ArrayList<>();
        Call<List<Post>> getPostApi = postApi.fetchPosts();
        try {
            Response<List<Post>> response = getPostApi.execute();
            if(response.isSuccessful() && response.body() !=null)
                posts = response.body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return posts;
    }

    @Override
    public Post getPost(int id) {
        Post post = null;
        Call<List<Post>> getPostApi = postApi.fetchPosts();
        List<Post> posts = new ArrayList<>();
        try {
            Response<List<Post>> response = getPostApi.execute();
            if(response.isSuccessful() && response.body() !=null)
                posts = response.body();
            for (int i =0; i<posts.size();i++){
                post = posts.get(i);
                if(post.getId()==id){
                    return post;
                }
            }
            post=null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return post;
    }
}
