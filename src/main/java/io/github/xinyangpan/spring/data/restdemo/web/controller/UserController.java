package io.github.xinyangpan.spring.data.restdemo.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.github.xinyangpan.spring.data.restdemo.po.UserPo;
import io.github.xinyangpan.spring.data.restdemo.restrepo.UserRepository;
import io.github.xinyangpan.spring.data.restdemo.web.vo.LoginVo;
import io.github.xinyangpan.spring.data.restdemo.web.vo.UserVo;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/login", method = RequestMethod.POST, headers = "content-type=application/json")
	public UserPo login(@RequestBody @Valid LoginVo loginVo) {
		UserPo userPo = userRepository.findByUserNameAndPassword(loginVo.getUserName(), loginVo.getPassword());
		if (userPo != null) {
			return userPo;
		} else {
			throw new RuntimeException("wrong username/password");
		}
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST, headers = "content-type=application/json")
	public UserPo register(@RequestBody UserVo UserVo) {
		UserPo userPo = UserVo.getUserPo();
		userPo.setPassword(UserVo.getPassword());
		return userRepository.save(userPo);
	}

}
