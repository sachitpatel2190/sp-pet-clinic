package com.sachit.learn.sppetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sachit.learn.sppetclinic.model.Speciality;
import com.sachit.learn.sppetclinic.model.Vet;
import com.sachit.learn.sppetclinic.services.SpecialityService;
import com.sachit.learn.sppetclinic.services.VetService;

@Service
@Profile({"default","map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

	private final SpecialityService specialityService;
	
	public VetServiceMap(SpecialityService specialityService){
		this.specialityService = specialityService;
	}
	
	@Override
	public Vet save(Vet vet) {
		
		if(vet != null) {
			if(vet.getSpecialities() != null) {
				vet.getSpecialities().forEach(speciality -> {
					
					if(speciality.getId() == null) {
						Speciality savedSpeciality = specialityService.save(speciality);
						speciality.setId(savedSpeciality.getId());
					}				
				});	
			}
			return super.save( vet);
		} else {
			return null;
		}
	}

	/**
	 *  Need to figure out why below code is added
	 */

	

	public Vet findById(Long id) {
		return super.findById(id);
	}


	
	public Set<Vet> findAll() {

		return super.findAll();
	}
	
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	public void delete(Vet object) {
		super.delete(object);
	}
}
