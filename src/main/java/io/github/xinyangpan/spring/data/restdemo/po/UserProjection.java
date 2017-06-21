package io.github.xinyangpan.spring.data.restdemo.po;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "userProjection", types = { UserPo.class })
public interface UserProjection {

	String getUserName();

	String getFirstName();

	String getLastName();

	String getPhone();

	String getEmail();

}