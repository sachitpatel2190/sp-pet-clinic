package com.sachit.learn.sppetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.sachit.learn.sppetclinic.model.Pet;
import com.sachit.learn.sppetclinic.services.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{

	@Override
	public Pet save(Pet pet) {
		return super.save(pet);
	}

	/**
	 *  Need to figure out why below code is added
	 */

	

	public Pet findById(Long id) {
		return super.findById(id);
	}

	
	
	
	public Set<Pet> findAll() {

		return super.findAll();
	}
	
	void deleteById(Long id) {
		super.deleteById(id);
	}
	
	void delete(Pet object) {
		super.delete(object);
	}
}
