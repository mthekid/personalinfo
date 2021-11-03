package com.starlab.msa.personalinfo.repository;

import com.starlab.msa.personalinfo.domain.Gender;
import com.starlab.msa.personalinfo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByWeightBetween(double start, double end);
}
