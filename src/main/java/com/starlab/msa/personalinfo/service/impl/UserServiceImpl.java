package com.starlab.msa.personalinfo.service.impl;

import com.starlab.msa.personalinfo.domain.User;
import com.starlab.msa.personalinfo.repository.UserRepository;
import com.starlab.msa.personalinfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<>();
        Iterable<User> iter = userRepository.findAll();
        for(User user : iter) userList.add(user);
        return userList;
    }

    @Override
    public List<User> getGenderUsers(String info) {
        List<User> userList = new ArrayList<>();
        Iterable<User> iter = userRepository.findAll();
        for(User user : iter) {
            if(info.equals(user.getGender().getName())) userList.add(user);
        }

        return userList;
    }

    @Override
    public List<User> getWeightBetween(double start, double end) {
        List<User> userList = new ArrayList<>();
        Iterable<User> iter = userRepository.findByWeightBetween(start, end);
        for(User user : iter) {
            userList.add(user);
        }

        return userList;
    }
}
