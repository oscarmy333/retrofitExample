package com.example.retrofitEjemplo.service.impl;

import com.example.retrofitEjemplo.model.User;
import com.example.retrofitEjemplo.service.UserApi;
import com.example.retrofitEjemplo.service.UserService;
import com.example.retrofitEjemplo.util.RetrofitUtil;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    private final UserApi userApi;
    private final Retrofit retrofit;

    public UserServiceImpl() {
        this.retrofit = RetrofitUtil.getRetrofitInstance();
        this.userApi = retrofit.create(UserApi.class);
    }

    @Override
    public List<User> fetchUser() {
        List<User> users = new ArrayList<>();
        Call<List<User>> getPostApi = userApi.fetchUsers();
        try {
            Response<List<User>> response = getPostApi.execute();
            if (response.isSuccessful() && response.body() != null)
                users = response.body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    @Override
    public User getUser(int id) {
        User user = null;
        Call<List<User>> getUserApi = userApi.fetchUsers();
        List<User> users = new ArrayList<>();
        try {
            Response<List<User>> response = getUserApi.execute();
            if (response.isSuccessful() && response.body() != null)
                users = response.body();
            for (User value : users) {
                user = value;
                if (user.getId() == id) {
                    return user;
                }
            }
            user = null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return user;
    }
}
