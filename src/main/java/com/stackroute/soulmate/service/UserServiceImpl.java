package com.stackroute.soulmate.service;

import com.stackroute.soulmate.model.User;
import com.stackroute.soulmate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }
    @Override
    public void deleteUser(int id){
        User user=userRepository.findById(id);
         userRepository.delete(user);
    }
    @Override
    public List<User> nameSearch(String name) {
        return (List<User>) userRepository.findByName(name);
    }

    @Override
    public List<User> ageSearch(int age) {
        return (List<User>) userRepository.getByAge(age);
    }

    @Override
    public List<User> genderSearch(String name) {
        return (List<User>) userRepository.getByGender(name);
    }


}
