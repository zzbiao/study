package vip.driftydream.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vip.driftydream.demo.model.RiskAssessor;
import vip.driftydream.demo.service.AccountService;

@Service
public class DatabaseAccountService implements AccountService{

	 private final RiskAssessor riskAssessor;
	 
	 @Autowired//如果一个bean 只有一个构造函数，则可以省略@Autowired。
	 public DatabaseAccountService(RiskAssessor riskAssessor){
		 this.riskAssessor = riskAssessor;
	 }
	 
	 public String getAccountName(){
		 riskAssessor.setName("abcdesf");
		 return riskAssessor.getName();
	 }
	
}
