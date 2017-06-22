package io.github.xinyangpan.spring.data.restdemo.core;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class WrongUsernameOrPasswordException extends RuntimeException {
	private static final long serialVersionUID = 5568554406677602970L;

	public WrongUsernameOrPasswordException() {
		super("Wrong username or password");
	}

}