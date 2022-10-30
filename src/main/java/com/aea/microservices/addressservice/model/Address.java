package com.aea.microservices.addressservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address
{
	@Id
	private String username;
	private String address;
	private String city;
	private String state;
	private String pinCode;
}
