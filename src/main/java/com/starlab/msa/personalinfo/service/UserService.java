package com.starlab.msa.personalinfo.service;

import com.starlab.msa.personalinfo.domain.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    List<User> getGenderUsers(String info);
    List<User> getWeightBetween(double start, double end);
    List<User> getAgeBetween(int start, int end);
}
