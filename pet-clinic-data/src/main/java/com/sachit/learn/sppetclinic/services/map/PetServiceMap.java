package com.sachit.learn.sppetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sachit.learn.sppetclinic.model.Pet;
import com.sachit.learn.sppetclinic.services.PetService;

@Service
@Profile({"default","map"})
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
	
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	public void delete(Pet object) {
		super.delete(object);
	}
}
