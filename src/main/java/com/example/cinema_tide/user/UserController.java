package com.example.cinema_tide.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5500")
@RestController
@RequestMapping(path = "/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping(path="/all")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/getById/{email}", method = RequestMethod.GET)
    @ResponseBody
    public User getIdUserByEmail(@PathVariable String email) { return userService.getIdByEmail(email);}

    @PostMapping(path="/addUser", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void register(@RequestBody User user){ userService.addNewUser(user); }

}
