package io.github.xinyangpan.spring.data.restdemo.core.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Gender {
	MALE(1, "male"), FEMALE(2, "female");

	private final int value;
	private final String displayName;

	private Gender(int value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	@JsonCreator
	public static Gender parse(int value) {
		switch (value) {
		case 1:
			return MALE;
		case 2:
			return FEMALE;
		default:
			throw new RuntimeException();
		}
	}

	@JsonValue
	public int getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

}
