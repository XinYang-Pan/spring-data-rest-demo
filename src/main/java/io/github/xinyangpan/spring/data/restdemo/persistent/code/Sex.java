package io.github.xinyangpan.spring.data.restdemo.persistent.code;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class Sex {
	private String displayName;
	private int code;

	public Sex() {
		this.displayName = "default";
	}

	public Sex(int code) {
		this.code = code;
	}

	@JsonCreator
	public static Sex create(int code) {
		Sex sex = new Sex();
		sex.setCode(code);
		sex.setDisplayName("From create" + System.currentTimeMillis());
		return sex;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sex [displayName=");
		builder.append(displayName);
		builder.append(", code=");
		builder.append(code);
		builder.append("]");
		return builder.toString();
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@JsonValue
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
