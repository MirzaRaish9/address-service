package com.raish.servicesp.addressservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.raish.servicesp.addressservice.model.Address;
import com.raish.servicesp.addressservice.service.AddressService;

@RestController
public class AddressController {

	
	@Autowired
	private AddressService addressService;
	
	@GetMapping("/address")
	List<Address> getAllAddress(){
		List<Address> a = addressService.getAllAddress();
		return a;
	}
	
	
	
	@GetMapping("/address/{employeeId}")
	ResponseEntity<Address> getEmployeeById(@PathVariable("employeeId") int employeeId){
		
		Address ad = addressService.getAddressById(employeeId);
		return ResponseEntity.status(HttpStatus.OK).body(ad);
		
	}
}
