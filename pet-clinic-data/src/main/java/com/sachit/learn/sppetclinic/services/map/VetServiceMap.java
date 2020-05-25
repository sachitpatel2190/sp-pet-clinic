package com.sachit.learn.sppetclinic.services.map;

import java.util.Set;

import com.sachit.learn.sppetclinic.model.Vet;
import com.sachit.learn.sppetclinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long>{

	@Override
	public Vet save(Vet Vet) {
		return super.save(Vet.getId(), Vet);
	}

	/**
	 *  Need to figure out why below code is added
	 */

	

	public Vet findById(Long id) {
		return super.findById(id);
	}

	Vet save(Long id, Vet object) {

		return super.save(id, object);
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
