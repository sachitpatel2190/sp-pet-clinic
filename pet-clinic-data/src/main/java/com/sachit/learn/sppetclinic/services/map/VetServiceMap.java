package com.sachit.learn.sppetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.sachit.learn.sppetclinic.model.Vet;
import com.sachit.learn.sppetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

	@Override
	public Vet save(Vet vet) {
		return super.save(vet);
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
	
	void deleteById(Long id) {
		super.deleteById(id);
	}
	
	void delete(Vet object) {
		super.delete(object);
	}
}
