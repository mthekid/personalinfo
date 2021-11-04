package com.starlab.msa.personalinfo.domain;


import com.starlab.msa.personalinfo.domain.converter.GenderConverter;
import com.starlab.msa.personalinfo.domain.converter.RoleConverter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel(value = "회원 정보", description = "식별 번호, 이름, 가명, 몸무게, 생년월일, 성별, 역할을 가진 Entity")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty(value="사용자의 식별 번호", example = "1", required = true)
    private Long Id;

    @Column(nullable = false)
    @ApiModelProperty(value="사용자의 이름", example = "문현준", required = true)
    private String name;

    @ApiModelProperty(value="사용자의 가명", example = "야생의코끼리", required = true)
    private String alias;

    @ApiModelProperty(value="몸무게", example = "88", required = true)
    private double weight;

    @ApiModelProperty(value="생년월일", example = "1995-04-15", required = true)
    private Date birthDay;

    @Column(name = "gender", nullable = false)
    @ApiModelProperty(value="성별", example = "남자/여자", required = true)
    private Gender gender;

    @Column(name = "role", nullable = false)
    @ApiModelProperty(value="역할", example = "사용자/관리자/등록자", required = true)
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





