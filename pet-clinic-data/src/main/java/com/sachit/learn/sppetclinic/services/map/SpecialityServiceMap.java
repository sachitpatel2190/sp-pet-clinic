package com.sachit.learn.sppetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sachit.learn.sppetclinic.model.Speciality;
import com.sachit.learn.sppetclinic.services.SpecialityService;

@Service
@Profile({"default","map"})
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService{

	@Override
	public Speciality save(Speciality vet) {
		return super.save(vet);
	}

	/**
	 *  Need to figure out why below code is added
	 */

	

	public Speciality findById(Long id) {
		return super.findById(id);
	}


	
	public Set<Speciality> findAll() {

		return super.findAll();
	}
	
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	public void delete(Speciality object) {
		super.delete(object);
	}
}
