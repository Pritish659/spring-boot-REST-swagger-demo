package com.stackroute.soulmate.service;

import com.stackroute.soulmate.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    void deleteUser(int id);
    List<User> nameSearch(String name);
    List<User> ageSearch(int age);
    List<User> genderSearch(String gender);
}
