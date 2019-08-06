package com.bae.rest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.service.AccountNumGeneratorService;
import com.bae.util.Constants;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountNumGeneratorControllerTests {
	
	@InjectMocks
	AccountNumGeneratorController controller;

	@Mock
	AccountNumGeneratorService service;
	
	@Test
	public void AccountNumGenTest() {
		
		Mockito.when(service.accountNumGen()).thenReturn(Constants.MOCK_ACCOUNT_NUMBER);
		
		assertEquals(Constants.MOCK_ACCOUNT_NUMBER, controller.accountNumGen().getBody());
		
		Mockito.verify(service).accountNumGen();
	}

}
