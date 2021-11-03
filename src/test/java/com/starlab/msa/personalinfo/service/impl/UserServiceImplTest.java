package com.starlab.msa.personalinfo.service.impl;

import com.starlab.msa.personalinfo.repository.UserRepository;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;


class UserServiceImplTest {

    private UserRepository userRepository;

    @BeforeEach
    public void setUp() {

    }

//    @After()
    public void cleanUp() {

    }

    @Test
    @DisplayName("사용자 목록 확인하기")
    public void getAllUser() {
        // given

        // when

        // then
    }

}
