package com.starlab.msa.personalinfo.domain.converter;

import com.starlab.msa.personalinfo.domain.Role;

import javax.persistence.AttributeConverter;

public class RoleConverter implements AttributeConverter<Role, String> {

    @Override
    public String convertToDatabaseColumn(Role role) {
        return role.getDescription();
    }

    @Override
    public Role convertToEntityAttribute(String dbData) {
        return Role.getByName(dbData);
    }

}
