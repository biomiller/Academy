package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.service.AccountNumGeneratorService;


@RestController
public class AccountNumGeneratorController {
	
	private AccountNumGeneratorService service;
	
	@Autowired
	public AccountNumGeneratorController(AccountNumGeneratorService service){
		this.service = service;
	}
	
	@RequestMapping("/accountNum")
	public ResponseEntity<String> accountNumGen(){
		
		ResponseEntity<String> accountNum = new ResponseEntity<String>(service.accountNumGen(), HttpStatus.OK);
	
		return(accountNum);
		
	}
}