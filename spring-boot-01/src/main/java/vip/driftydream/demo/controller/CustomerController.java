package vip.driftydream.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vip.driftydream.demo.service.impl.DatabaseAccountService;

@RestController
public class CustomerController {
	
	@Autowired
	private DatabaseAccountService databaseAccountService;
	
	@RequestMapping("/hello")
	public String hello(){
		return databaseAccountService.getAccountName();
	}

	@RequestMapping("/home")
	public String home(){
		return "hello world";
	}
	
	@RequestMapping("/home2")
	public String home2(){
		return "hello world2";
	}
}
