package com.starlab.msa.personalinfo.domain;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum Gender {
    MALE("male"),
    FEMALE("female"),
    UNKNOWN("unknown");

    private String name;

    Gender(String name) {
        this.name = name;
    }

    public static Gender getByName(String name) {
        return Arrays.stream(Gender.values())
                .filter(gender -> gender.getName().equals(name))
                .findFirst()
                .orElse(UNKNOWN);
    }
}
