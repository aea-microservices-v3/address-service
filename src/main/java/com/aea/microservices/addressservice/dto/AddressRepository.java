package com.aea.microservices.addressservice.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aea.microservices.addressservice.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, String>
{

}
