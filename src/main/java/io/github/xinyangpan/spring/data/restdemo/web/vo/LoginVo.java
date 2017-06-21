package io.github.xinyangpan.spring.data.restdemo.web.vo;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginVo {
	@NotEmpty
	private String userName;
	@NotEmpty
	private String password;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoginVo [userName=");
		builder.append(userName);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
