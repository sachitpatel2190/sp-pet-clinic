package com.sachit.learn.sppetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.sachit.learn.sppetclinic.model.Owner;
import com.sachit.learn.sppetclinic.model.Pet;
import com.sachit.learn.sppetclinic.services.OwnerService;
import com.sachit.learn.sppetclinic.services.PetService;
import com.sachit.learn.sppetclinic.services.PetTypeService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{

	private PetTypeService petTypeService;
	private PetService petService;
	
	public OwnerServiceMap(PetTypeService petTypeServicve, PetService petService) {
		this.petTypeService = petTypeServicve;
		this.petService = petService;
	}
	
	@Override
	public Owner save(Owner owner) {
		
		if(owner != null) {
			if(owner.getPets() != null) {
				owner.getPets().forEach(pet -> {
					if(pet.getPetType() != null) {
						if(pet.getPetType().getId() == null) {
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
						
					} else {
						throw new RuntimeException("Pet Type is Required");
					}
					
					if(pet.getId() == null) {
						Pet savedPet = petService.save(pet);
						pet.setId(savedPet.getId());
					}				
				});	
			}
			return super.save( owner);
		} else {
			return null;
		}
	}

	/**
	 *  Need to figure out why below code is added
	 */

	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	public Set<Owner> findAll() {

		return super.findAll();
	}
	
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public Owner findByLastName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
