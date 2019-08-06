package com.bae.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.util.Constants;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PrizeGeneratorServiceTests {
	
	@InjectMocks
	PrizeGenService service;
	
	@Test
	public void getPrizeTest() {
		
		assertEquals(service.getPrize(Constants.MOCK_ACCOUNT_NUMBER), "£500 Prize.");
	}

}
