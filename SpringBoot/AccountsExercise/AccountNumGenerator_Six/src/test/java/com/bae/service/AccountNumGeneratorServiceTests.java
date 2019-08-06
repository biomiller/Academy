package com.bae.service;

import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountNumGeneratorServiceTests {
	
	@InjectMocks
	AccountNumGeneratorService service;
	
	@Mock
	Random rand;
	
	@Test
	public void AccountNumGenTest() {
		return;
	}

}
