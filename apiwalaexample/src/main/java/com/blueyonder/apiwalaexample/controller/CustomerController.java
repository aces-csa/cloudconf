package com.blueyonder.apiwalaexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blueyonder.apiwalaexample.model.Customer;
import com.blueyonder.apiwalaexample.repostiory.CustomerRepo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping( "/api/customers")
public class CustomerController {
	
	
	@Autowired 
	private CustomerRepo  customerRepo ; 
	
	
	@PostMapping("/addcustomer")
	public Customer postMethodName(@RequestBody Customer customer) {
		 customerRepo.save(customer)  ;
		
		return  customer ; 
		
	}
	
	@GetMapping("/hello")
	public String getMethodName() {
		return "hello" ;
	}
	
	
	

}
