package com.stackroute.soulmate.repository;

import com.stackroute.soulmate.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User,Integer> {
    User findById(int id);
    List<User> findByName(String name);
    List<User> getByAge(int age);
    List<User> getByGender(String gender);
}
