package io.github.xinyangpan.spring.data.restdemo.persistent.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import io.github.xinyangpan.spring.data.restdemo.core.enums.Gender;

@Converter
public class GenderConverter implements AttributeConverter<Gender, Integer> {

	@Override
	public Integer convertToDatabaseColumn(Gender attribute) {
		return attribute.getValue();
	}

	@Override
	public Gender convertToEntityAttribute(Integer dbData) {
		return Gender.parse(dbData);
	}

}
