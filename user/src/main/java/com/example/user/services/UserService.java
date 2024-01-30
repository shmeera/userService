package com.example.user.services;

import com.example.user.interfaces.IUserService;
import com.example.user.models.User;
import com.example.user.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

@Service
public class UserService  {

    private UserRepositories userRepositories;
    @Autowired
    public UserService(UserRepositories userRepositories) {
        this.userRepositories = userRepositories;
    }

    public Optional<User> GetUserById(Long Id)
    {
        return userRepositories.findById(Id);
    }
    public User signUp(String name, String email, String password, String location) {
        Optional<User> userOptional = userRepositories.findByEmail(email);
        if(userOptional.isPresent()) {
            throw new RuntimeException();
        }
        User user = new User();
        user.setName(name);
        user.setEmail(email);


//        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//        user.setPassword(bCryptPasswordEncoder.encode(password));
       user.setPassword(password);

        user.setLocation(location);
        return userRepositories.save(user);

    }
    public User login(String email, String password){
        Optional<User> userOptional = userRepositories.findByEmail(email);
        if(userOptional.isEmpty()){
            throw new RuntimeException();
        }

        User user = userOptional.get();
//        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//        if(bCryptPasswordEncoder.matches(password, user.getPassword())){
//            return user;
//        }

        //throw new RuntimeException();
        return user;
    }
}
