package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Account;
import com.service.AccountService;

@RestController
@RequestMapping("account")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	//http://localhost:8383/account/createAccount
	//json data {"acco":1,"name":"John","emailid":"john@gmail.com","amount":20000}
	
	@PostMapping(value = "createAccount", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createAccount(@RequestBody Account account) {
		return accountService.createAccount(account);
	}
	
	//http://localhost:8383/account/findBalanceByAccno/1
	
	@GetMapping(value = "findBalanceByAccno/{accno}")
	public String findBalanceByAccno(@PathVariable("accno") int accno) {
		return accountService.findBalanceByAccno(accno);
	}
	
	//http://localhost:8383/account/findBalanceByEmailID
	
	@GetMapping(value = "findBalanceByEmailID/{emailid}")
	public String findBalanceByEmailID(@PathVariable("emailid") String emailid) {
		return accountService.findBalanceByEmailID(emailid);
	}
}
