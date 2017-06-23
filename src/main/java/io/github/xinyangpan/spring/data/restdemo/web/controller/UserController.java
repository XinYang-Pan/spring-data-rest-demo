package io.github.xinyangpan.spring.data.restdemo.web.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.github.xinyangpan.spring.data.restdemo.core.WrongUsernameOrPasswordException;
import io.github.xinyangpan.spring.data.restdemo.persistent.po.UserPo;
import io.github.xinyangpan.spring.data.restdemo.restrepo.UserRepository;
import io.github.xinyangpan.spring.data.restdemo.web.vo.LoginVo;
import io.github.xinyangpan.spring.data.restdemo.web.vo.UserVo;

@RestController
public class UserController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/login", method = RequestMethod.POST, headers = "content-type=application/json")
	public UserPo login(@RequestBody @Valid LoginVo loginVo) {
		UserPo userPo = userRepository.findByUsernameAndPassword(loginVo.getUsername(), loginVo.getPassword());
		if (userPo != null) {
			log.info("login user - {}", userPo);
			return userPo;
		} else {
			throw new WrongUsernameOrPasswordException();
		}
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST, headers = "content-type=application/json")
	public UserPo register(@RequestBody UserVo userVo) {
		log.info("register user - {}", userVo);
		UserPo userPo = userVo.getUserPo();
		userPo.setPassword(userVo.getPassword());
		return userRepository.save(userPo);
	}

}
