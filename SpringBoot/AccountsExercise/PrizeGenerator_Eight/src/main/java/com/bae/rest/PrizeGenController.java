package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.service.PrizeGenService;

@RestController
public class PrizeGenController {
	
	private PrizeGenService service;
	
	@Autowired
	public PrizeGenController(PrizeGenService service){
		this.service = service;
	}
	
	@RequestMapping("/prizeGen/{accountNum}")
	public ResponseEntity<String> getPrize(@PathVariable("accountNum") String accountNum){
		
		ResponseEntity<String> prize = new ResponseEntity<String>(service.getPrize(accountNum), HttpStatus.OK);
	
		return(prize);
		
	}
	
	
	

}
