package com.sachit.learn.sppetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sachit.learn.sppetclinic.model.PetType;
import com.sachit.learn.sppetclinic.services.PetTypeService;

@Service
@Profile({"default","map"})
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService{

	@Override
	public PetType save(PetType pet) {
		return super.save(pet);
	}

	/**
	 *  Need to figure out why below code is added
	 */	

	public PetType findById(Long id) {
		return super.findById(id);
	}	
	
	public Set<PetType> findAll() {

		return super.findAll();
	}
	
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	public void delete(PetType object) {
		super.delete(object);
	}
}
