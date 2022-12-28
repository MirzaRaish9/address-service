package com.raish.servicesp.addressservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.raish.servicesp.addressservice.model.Address;
import com.raish.servicesp.addressservice.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	public List<Address> getAllAddress() {
		return addressRepository.findAll();
	}
	
	
	public Address getAddressById(int id) {
		Address ad = addressRepository.findById(id).get();
		return ad;
	}
}
