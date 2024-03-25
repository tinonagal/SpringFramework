package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Account;
import com.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	AccountService accountService;
	
	//http://localhost:8080/findAllAccount
	@RequestMapping(value = "findAllAccount", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Account> findAllAccountDetails(){
		return accountService.findAllAccount();
	}
	
	//http://localhost:8080/findAccountInfo/1    using path param
	//http://localhost:8080/findAccountInfo/2
	
	@RequestMapping(value = "findAccountInfo/{accno}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Account findAccountInfo(@PathVariable("accno") int accno) {
		return accountService.findAccountInfo(accno);
	}
	//http://localhost:8080/createAccount
	//{"accno":3,"name":"Smith","amount":60000.0}
	@RequestMapping(value = "createAccount", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createAccount(@RequestBody Account account) {
		System.out.println(account.getAccno()+" "+account.getAmount()+" "+account.getName());
		return accountService.accountCreate(account);
	}
	
	//http://localhost:8080/deleteAccount/4
	//http://localhost:8080/deleteAccount/100
	@RequestMapping(value = "deleteAccount/{accno}", method = RequestMethod.DELETE)
	public String deleteAccount(@PathVariable("accno") int accno) {
		return accountService.deleteAccount(accno);
	}
	
	//http://localhost:8080/withdraw
	//method patch
	// date as json {"accno":2,"amount":1000}
	@RequestMapping(value = "withdraw", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String withdrawn(@RequestBody Account account) {
		return accountService.withdrawn(account.getAccno(), account.getAmount());
	}
	
	//http://localhost:8080/deposit/2/1000
	//method put
		
	@RequestMapping(value = "deposit/{accno}/{amount}", method = RequestMethod.PUT)
	public String deposit(@PathVariable("accno") int accno, @PathVariable("amount") float amount) {
		return accountService.deposit(accno,amount);
	}
}
