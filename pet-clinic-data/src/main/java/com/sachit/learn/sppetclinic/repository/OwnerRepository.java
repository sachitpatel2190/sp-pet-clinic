package com.sachit.learn.sppetclinic.repository;

import org.springframework.data.repository.CrudRepository;

import com.sachit.learn.sppetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long>{
	
	  Owner findByLastName(String lastName);

}
