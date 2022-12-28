package com.raish.servicesp.addressservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raish.servicesp.addressservice.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

	//boolean existByEmployeeId(int employeeId);
}
