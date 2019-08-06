package com.bae.service;

import org.springframework.stereotype.Service;

@Service
public class PrizeGenService {

	public String getPrize(String accountNum) {

		String prize = "";
		
		char abc = accountNum.charAt(0);

		if (abc == 'a') {
			prize = "No Prize.";
		} else if (abc == 'b') {
			prize = "£50 Prize.";
		} else if (abc == 'c') {
			prize = "£100 Prize.";
		}

		return (prize);

	}

}
