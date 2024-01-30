package com.example.user.interfaces;

import com.example.user.models.User;

import java.util.Optional;

public interface IUserService {
   public Optional<User> GetUserById(Long Id);
   public User signUp(String name, String email, String password);
    public User login(String email, String password);
}
