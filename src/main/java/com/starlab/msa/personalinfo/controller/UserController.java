package com.starlab.msa.personalinfo.controller;


import com.starlab.msa.personalinfo.domain.User;
import com.starlab.msa.personalinfo.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = {"마이크로바이옴 사용자의 정보를 제공하는 Controller의 API입니다."})
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation(value = "user infos", notes = "사용자 정보 목록을 반환합니다.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "page not found")
    })
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }


    @ApiOperation(value = "filter gender", notes = "사용자의 성별을 조건으로 목록을 반환합니다 .")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "page not found")
    })
    @GetMapping("/gender/{info}")
    public List<User> getGenderUsers(
            @ApiParam(value = "검색 성별 값", type = "String", example = "male/female", required = true) @PathVariable("info") String info) {
        return userService.getGenderUsers(info);
    }


    @ApiOperation(value = "filter weight", notes = "사용자의 몸무게를 조건으로 목록을 반환합니다.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "page not found")
    })
    @GetMapping("/weight/{start}/{end}")
    public List<User> getWeightBetween(
            @ApiParam(value = "검색 몸무게의 시작 값", type = "double", example = "40.5", required = true) @PathVariable("start") double start,
            @ApiParam(value = "검색 몸무게의 끝 값",  type = "double", example = "77.5", required = true) @PathVariable("end") double end) {
        return userService.getWeightBetween(start, end);
    }


    @ApiOperation(value = "filter age", notes = "사용자의 나이를 조건으로 목록을 반환합니다.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "page not found")
    })
    @GetMapping("/age/{start}/{end}")
    public List<User> getAgeBetween(
            @ApiParam(value = "검색 나이의 시작 값", type = "int", example = "15", required = true) @PathVariable int start,
            @ApiParam(value = "검색 나이의 끝 값", type = "int", example = "45", required = true) @PathVariable int end ) {
        return userService.getAgeBetween(start, end);
    }

}
