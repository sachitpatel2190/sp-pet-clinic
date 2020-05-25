package com.sachit.learn.sppetclinic.services.map;

import java.util.Set;

import com.sachit.learn.sppetclinic.model.Pet;
import com.sachit.learn.sppetclinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long>{

	@Override
	public Pet save(Pet Pet) {
		return super.save(Pet.getId(), Pet);
	}

	/**
	 *  Need to figure out why below code is added
	 */

	

	public Pet findById(Long id) {
		return super.findById(id);
	}

	Pet save(Long id, Pet object) {

		return super.save(id, object);
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
