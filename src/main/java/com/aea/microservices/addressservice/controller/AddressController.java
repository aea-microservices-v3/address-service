package com.aea.microservices.addressservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aea.microservices.addressservice.dto.AddressRepository;
import com.aea.microservices.addressservice.model.Address;

@RestController
@RequestMapping("/address")
public class AddressController
{
	private static Logger LOG = LoggerFactory.getLogger(AddressController.class);
	
	@Autowired
	private AddressRepository addressRepository;
	
	@GetMapping("/{username}")
	public Address getAddress(@PathVariable final String username)
	{
		LOG.info("Get Address: username -> {}", username);
		return addressRepository.findById(username).get();
	}
}
