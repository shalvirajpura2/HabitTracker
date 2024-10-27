package com.example.habittracker.repository;
import java.util.Optional;


import com.example.habittracker.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface UserRepository extends MongoRepository<User,String> {
	Optional<User> findByUsername(String username);
}
