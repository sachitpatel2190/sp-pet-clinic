package com.sachit.learn.sppetclinic.services;

import java.util.Set;

import com.sachit.learn.sppetclinic.model.Owner;
import com.sachit.learn.sppetclinic.model.Pet;
import com.sachit.learn.sppetclinic.model.Vet;

public interface VetService {

	Pet findById(Long id);
	
	Owner save(Vet vet);
	
	Set<Vet> findAll();
}
