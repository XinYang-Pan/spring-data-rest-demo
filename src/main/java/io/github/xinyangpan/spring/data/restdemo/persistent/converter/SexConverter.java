package io.github.xinyangpan.spring.data.restdemo.persistent.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import io.github.xinyangpan.spring.data.restdemo.persistent.code.Sex;

@Converter
public class SexConverter implements AttributeConverter<Sex, Integer> {

	@Override
	public Integer convertToDatabaseColumn(Sex attribute) {
		return attribute.getCode();
	}

	@Override
	public Sex convertToEntityAttribute(Integer dbData) {
		return Sex.create(dbData);
	}

}
