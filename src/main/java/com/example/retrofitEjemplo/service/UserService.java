package com.example.retrofitEjemplo.service;


import com.example.retrofitEjemplo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> fetchUser();

    public User getUser(int id);
}
