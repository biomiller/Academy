package com.bae.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class AccountNumGeneratorService {

	public String accountNumGen() {

		Random rand = new Random();

		String num = Integer.toString(rand.nextInt(899999) + 100000);

		char abc = (char) (rand.nextInt(3) + 'a');

		String accountNum = abc + num;

		return (accountNum);

	}

}
