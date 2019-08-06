package com.bae.rest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.service.PrizeGenService;
import com.bae.util.Constants;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PrizeGeneratorControllerTests {
	
	@InjectMocks
	PrizeGenController controller;

	@Mock
	PrizeGenService service;
	
	@Test
	public void AccountNumGenTest() {
		
		Mockito.when(service.getPrize(Constants.MOCK_ACCOUNT_NUMBER)).thenReturn("£50 Prize.");
		
		assertEquals("£50 Prize.", controller.getPrize(Constants.MOCK_ACCOUNT_NUMBER).getBody());
		
		Mockito.verify(service).getPrize(Constants.MOCK_ACCOUNT_NUMBER);

	}

}
