package com.bae.rest;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.entity.Account;
import com.bae.service.AccountServiceImpl;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	private AccountServiceImpl accountService;
	

	
    @Autowired
    public AccountController(AccountServiceImpl accountService) {
            this.accountService = accountService;

    }
	
	@GetMapping(value = "/all", produces = "application/json")
	public Collection<Account> getAll(){
		return accountService.getAll();
	}
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public Optional<Account> getAccount(@PathVariable("id") Long id){
		return accountService.getAccount(id);
	}
	
	@PostMapping(value = "/createAccount", consumes = "application/json")
	public String createAccount(@RequestBody Account account) {
		return accountService.createAccount(account);
	}
	
	@DeleteMapping("/deleteAccount/{id}")
	public String deleteAccount(@PathVariable("id") Long id) {
		return accountService.deleteAccount(id);
	}
	
	@PutMapping(value = "/updateAccount", consumes = "application/json")
	public String updateAccount(@RequestBody Account account) {
		return accountService.updateAccount(account);
	}
	

	
}
