package com.starlab.msa.personalinfo.domain;

import lombok.Getter;

@Getter
public enum Role {
    ADMIN("관리자"),
    USER("사용자");

    private String description;

    Role(String description) {
        this.description = description;
    }
}
