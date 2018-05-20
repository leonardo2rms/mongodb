package com.example.mongodb.resource;

import com.example.mongodb.document.Users;
import com.example.mongodb.repository.UsersRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    private UsersRepository usersRepository;
    @GetMapping()
    public List<Users> findAll(){
        return usersRepository.findAll();
    }
}
