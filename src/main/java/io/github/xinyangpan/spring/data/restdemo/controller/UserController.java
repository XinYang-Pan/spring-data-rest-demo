package io.github.xinyangpan.spring.data.restdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.xinyangpan.spring.data.restdemo.bo.UserBo;
import io.github.xinyangpan.spring.data.restdemo.po.UserPo;
import io.github.xinyangpan.spring.data.restdemo.restrepo.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/login", method = RequestMethod.POST, headers = { "content-type=application/json" })
	public UserPo login(@RequestParam String userName, @RequestParam String password) {
		UserPo userPo = userRepository.findByUserNameAndPassword(userName, password);
		if (userPo != null) {
			return userPo;
		} else {
			throw new RuntimeException("wrong username/password");
		}
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST, headers = { "content-type=application/json" })
	public UserPo register(@RequestBody UserBo UserBo) {
		UserPo userPo = UserBo.getUserPo();
		userPo.setPassword(UserBo.getPassword());
		return userRepository.save(userPo);
	}

}
