package com.niyuj.group.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {
	@Autowired
	ServiceLayer servicelayer;

	@RequestMapping(method=RequestMethod.POST, value="/login")
	public String loginApi() {
		servicelayer.login();
		return "Logged in Succsefuly";
	}
	@RequestMapping(method=RequestMethod.POST, value="/role")
	public String roleAssigning() {
		servicelayer.roleAssigning();
		return "you are a student";
	}
}
