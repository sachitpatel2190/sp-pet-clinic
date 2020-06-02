package com.sachit.learn.sppetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sachit.learn.sppetclinic.model.Visit;
import com.sachit.learn.sppetclinic.services.VisitService;

@Service
@Profile({"default","map"})
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService{

	
	@Override
	public Visit save(Visit visit) {
		
		if(visit == null || visit.getPet() == null || visit.getPet().getOwner() == null ||
				visit.getPet().getId() == null || visit.getPet().getOwner().getId() == null) {
			throw new  RuntimeException("Invalid Visit");
		}
		return super.save(visit);
	}

	/**
	 *  Need to figure out why below code is added
	 */

	

	public Visit findById(Long id) {
		return super.findById(id);
	}


	
	public Set<Visit> findAll() {

		return super.findAll();
	}
	
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	public void delete(Visit object) {
		super.delete(object);
	}
}
