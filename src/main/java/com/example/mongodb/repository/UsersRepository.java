package com.example.mongodb.repository;

import com.example.mongodb.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

//@Repository
public interface UsersRepository extends MongoRepository<Users, Integer > {

}
