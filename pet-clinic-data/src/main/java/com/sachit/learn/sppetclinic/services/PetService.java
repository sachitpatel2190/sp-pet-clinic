package com.sachit.learn.sppetclinic.services;

import java.util.Set;

import com.sachit.learn.sppetclinic.model.Owner;
import com.sachit.learn.sppetclinic.model.Pet;

public interface PetService {

	Pet findById(Long id);
	
	Owner save(Pet pet);
	
	Set<Pet> findAll();
}
