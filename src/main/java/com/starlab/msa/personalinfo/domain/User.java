package com.starlab.msa.personalinfo.domain;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(nullable = false)
    private String name;
    private String alias;
    private double weight;
    private Date birthDay;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    public User() {}

    @Builder
    public User(Long id, String name, String alias, double weight, Date birthDay, Gender gender, Role role) {
        Id = id;
        this.name = name;
        this.alias = alias;
        this.weight = weight;
        this.birthDay = birthDay;
        this.gender = gender;
        this.role = role;
    }
}





