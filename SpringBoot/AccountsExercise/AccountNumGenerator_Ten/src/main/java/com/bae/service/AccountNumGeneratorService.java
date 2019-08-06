package com.bae.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class AccountNumGeneratorService {

	public String accountNumGen() {

		Random rand = new Random();

		String num1 = Integer.toString(rand.nextInt(99999) + 10000);
		String num2 = Integer.toString(rand.nextInt(99999) + 10000);

		char abc = (char) (rand.nextInt(3) + 'a');

		String accountNum = abc + num1 + num2;

		return (accountNum);

	}

}
