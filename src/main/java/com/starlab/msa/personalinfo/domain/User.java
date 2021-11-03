package com.starlab.msa.personalinfo.domain;


import com.starlab.msa.personalinfo.domain.converter.GenderConverter;
import com.starlab.msa.personalinfo.domain.converter.RoleConverter;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "user")
@Convert(converter = GenderConverter.class, attributeName = "gender")
@Convert(converter = RoleConverter.class, attributeName = "role")
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

    @Column(name = "gender", nullable = false)
    private Gender gender;

    @Column(name = "role", nullable = false)
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





