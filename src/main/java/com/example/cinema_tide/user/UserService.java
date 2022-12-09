package com.example.cinema_tide.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getIdByEmail(String email){
        Optional<User> userByEmail = userRepository.findUserByEmail(email);
        if(!userByEmail.isPresent()) {
            throw new IllegalStateException("Brak takiego filmu");
        }

        return userByEmail.get();
    }

    public void addNewUser(User user){
        userRepository.save(user);
    }
}
