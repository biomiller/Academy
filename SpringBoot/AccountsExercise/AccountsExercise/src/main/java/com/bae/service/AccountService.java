package com.bae.service;

import java.util.Collection;
import java.util.Optional;

import com.bae.entity.Account;

public interface AccountService {
	
	Collection<Account> getAll();
	Optional<Account> getAccount(Long id);
	String deleteAccount(Long id);
	String updateAccount(Account account);
	String createAccount(Account account);

}
