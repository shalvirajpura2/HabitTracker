package com.example.habittracker.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.habittracker.model.Habit;

public interface HabitRepository extends MongoRepository<Habit,String> {
	List<Habit> findByUsername(String username);
}
