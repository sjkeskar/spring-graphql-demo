package com.example.demo.Controller;

import com.example.demo.Repository.UserRepository;
import com.example.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository repo;

    @GetMapping("/")
    public List<User> getUser(){
        List<User> users = repo.findAll();
        users.forEach(user -> System.out.println(user.toString()));
        return repo.findAll();
    }

    @QueryMapping
    public List<User> getUsers(){
        return repo.findAll();
    }

    @MutationMapping
    public User createUser(@Argument UserInput user){
        User newUser = new User();
        newUser.setFirstName(user.firstName);
        newUser.setLastName(user.lastName);
        newUser.setEmailId(user.emailId);
        newUser.setPassword(user.password);
        newUser.setPhoneNumber(user.phoneNumber);
        return repo.save(newUser);
    }

    record UserInput(String firstName,String lastName, String emailId, Long phoneNumber, String password){};
}
