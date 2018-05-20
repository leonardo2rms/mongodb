package com.example.mongodb.config;

import com.example.mongodb.document.Users;
import com.example.mongodb.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages ="com")
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UsersRepository usersRepository){
        return strings->{
            usersRepository.save(new Users(1, "Peter", "Development", 3000L));
            usersRepository.save(new Users(2, "Sam", "Operations", 2000L));
        };
    }

}
