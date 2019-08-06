package com.bae.util;

import com.bae.entity.Account;

public class Constants {
	
	public static final String MOCK_ACCOUNT_STRING_1 = "{\"id\": 1,\"firstName\": \"Owen\",\"lastName\": \"Miller\",\"accountNumber\": \"b2659390674\"}";
	public static final String MOCK_ACCOUNT_STRING_2 = "{\"id\": 2,\"firstName\": \"Dave\",\"lastName\": \"Smith\",\"accountNumber\": \"c5895868346\"}";
	public static final String MOCK_ACCOUNT_COLLECTION = "[{\"id\": 1,\"firstName\": \"Owen\",\"lastName\": \"Miller\",\"accountNumber\": \"b2659390674\"},{\"id\": 2,\"firstName\": \"Dave\",\"lastName\": \"Smith\",\"accountNumber\": \"c5895868346\"}]";

	public static final Account MOCK_ACCOUNT_1 = new Account((long) 1,"Owen","Miller","a2659390674");
	public static final Account MOCK_ACCOUNT_2 = new Account((long) 2,"Dave","Smith","c5895868346");

	public static final String MOCK_DELETE_SUCCESS_RESPONSE = "Account Deleted.";
	public static final String MOCK_UPDATE_SUCCESS_RESPONSE = "Account Updated.";

	public static final String MOCK_FAILURE_RESPONSE = "Account not found.";


}
