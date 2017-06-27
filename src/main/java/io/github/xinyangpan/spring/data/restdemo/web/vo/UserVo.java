package io.github.xinyangpan.spring.data.restdemo.web.vo;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import io.github.xinyangpan.spring.data.restdemo.persistent.po.UserPo;

public class UserVo {
	@NotNull
	private UserPo userPo;
	@NotEmpty
	private String password;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserVo [userPo=");
		builder.append(userPo);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}

	public UserPo getUserPo() {
		return userPo;
	}

	public void setUserPo(UserPo userPo) {
		this.userPo = userPo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
