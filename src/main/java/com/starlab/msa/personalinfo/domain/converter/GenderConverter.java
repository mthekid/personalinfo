package com.starlab.msa.personalinfo.domain.converter;

import com.starlab.msa.personalinfo.domain.Gender;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class GenderConverter implements AttributeConverter<Gender, String> {


    @Override
    public String convertToDatabaseColumn(Gender gender) {
        return gender.getName();
    }

    @Override
    public Gender convertToEntityAttribute(String dbData) {
        return Gender.getByName(dbData);
    }

}
