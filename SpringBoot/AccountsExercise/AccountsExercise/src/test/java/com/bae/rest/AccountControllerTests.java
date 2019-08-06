package com.bae.rest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.entity.Account;
import com.bae.service.AccountServiceImpl;
import com.bae.util.Constants;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountControllerTests {
	
	@InjectMocks
	AccountController controller;

	@Mock
	AccountServiceImpl service;
	
	@Test
	public void getAllTest() {
		
		Collection<Account> MOCK_COLLECTION = new ArrayList<>();
		
		MOCK_COLLECTION.add(Constants.MOCK_ACCOUNT_1);
		MOCK_COLLECTION.add(Constants.MOCK_ACCOUNT_2);
		
		Mockito.when(service.getAll()).thenReturn(MOCK_COLLECTION);
		
		assertEquals(MOCK_COLLECTION, controller.getAll());
		
		Mockito.verify(service).getAll();

	}
	
	@Test
	public void getAccountTest() {
		
		Mockito.when(service.getAccount((long)1)).thenReturn(Optional.of(Constants.MOCK_ACCOUNT_1));
		
		assertEquals(Optional.of(Constants.MOCK_ACCOUNT_1), controller.getAccount((long)1));
		
		Mockito.verify(service).getAccount((long)1);
	}
	
	@Test
	public void createAccountTest() {
		
		Mockito.when(service.createAccount(Constants.MOCK_ACCOUNT_1)).thenReturn(Mockito.anyString());
		
		assertEquals(Mockito.anyString(), controller.createAccount(Constants.MOCK_ACCOUNT_1));
		
		Mockito.verify(service).createAccount(Constants.MOCK_ACCOUNT_1);
	}
	
	
	@Test
	public void deleteAccountSuccessTest() {
		
		Mockito.when(service.deleteAccount((long)1)).thenReturn(Constants.MOCK_DELETE_SUCCESS_RESPONSE);
	
		assertEquals(Constants.MOCK_DELETE_SUCCESS_RESPONSE, controller.deleteAccount((long)1));
		
		Mockito.verify(service).deleteAccount((long)1);		
	}
	
	@Test
	public void deleteAccountFailureTest() {
		
		Mockito.when(service.deleteAccount((long)5)).thenReturn(Constants.MOCK_FAILURE_RESPONSE);
	
		assertEquals(Constants.MOCK_FAILURE_RESPONSE, controller.deleteAccount((long)5));
		
		Mockito.verify(service).deleteAccount((long)5);		
	}

	
	@Test
	public void updateAccountSuccessTest() {
		
		Mockito.when(service.updateAccount(Constants.MOCK_ACCOUNT_1)).thenReturn(Constants.MOCK_UPDATE_SUCCESS_RESPONSE);
	
		assertEquals(Constants.MOCK_UPDATE_SUCCESS_RESPONSE, controller.updateAccount(Constants.MOCK_ACCOUNT_1));
		
		Mockito.verify(service).updateAccount(Constants.MOCK_ACCOUNT_1);		
	
	}
	
	@Test
	public void updateAccountFailureTest() {
		
		Mockito.when(service.updateAccount(Constants.MOCK_ACCOUNT_2)).thenReturn(Constants.MOCK_FAILURE_RESPONSE);
	
		assertEquals(Constants.MOCK_FAILURE_RESPONSE, controller.updateAccount(Constants.MOCK_ACCOUNT_2));
		
		Mockito.verify(service).updateAccount(Constants.MOCK_ACCOUNT_2);		
	
	}
}
