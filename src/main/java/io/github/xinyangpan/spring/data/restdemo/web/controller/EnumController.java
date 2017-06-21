package io.github.xinyangpan.spring.data.restdemo.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;

import io.github.xinyangpan.spring.data.restdemo.core.enums.Gender;

@RestController
public class EnumController {

	@RequestMapping(value = "/enums")
	public List<Enum<?>> enums() {
		return Lists.newArrayList(Gender.MALE, Gender.FEMALE);
	}

}
