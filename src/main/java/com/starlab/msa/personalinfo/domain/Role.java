package com.starlab.msa.personalinfo.domain;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum Role {
    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER"),
    UNKNOWN("unknown");

    private String description;

    Role(String description) {
        this.description = description;
    }

    public static Role getByName(String description) {
        return Arrays.stream(Role.values())
                .filter(role -> role.getDescription().equals(description))
                .findFirst()
                .orElse(UNKNOWN);
    }
}
