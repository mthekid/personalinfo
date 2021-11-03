package com.starlab.msa.personalinfo.service;

import com.starlab.msa.personalinfo.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    List<User> getGenderUsers(String info);
    List<User> getWeightBetween(double start, double end);
}
