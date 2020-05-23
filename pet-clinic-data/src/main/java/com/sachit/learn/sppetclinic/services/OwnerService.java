package com.sachit.learn.sppetclinic.services;

import java.util.Set;

import com.sachit.learn.sppetclinic.model.Owner;

public interface OwnerService {

	public Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Owner findByLastName(String name);
	
	Set<Owner> findAll();
}
