package io.github.xinyangpan.spring.data.restdemo.web.vo;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginVo {
	@NotEmpty
	private String username;
	@NotEmpty
	private String password;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoginVo [username=");
		builder.append(username);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String userName) {
		this.username = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
