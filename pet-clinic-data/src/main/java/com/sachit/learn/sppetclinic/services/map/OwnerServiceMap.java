package com.sachit.learn.sppetclinic.services.map;

import java.util.HashSet;
import java.util.Set;

import com.sachit.learn.sppetclinic.model.Owner;
import com.sachit.learn.sppetclinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>{

	@Override
	public Owner save(Owner owner) {
		return super.save(owner.getId(), owner);
	}

	/**
	 *  Need to figure out why below code is added
	 */

	

	public Owner findById(Long id) {
		return super.findById(id);
	}

	Owner save(Long id, Owner object) {

		return super.save(id, object);
	}
	
	
	public Set<Owner> findAll() {

		return super.findAll();
	}
	
	void deleteById(Long id) {
		super.deleteById(id);
	}
	
	void delete(Owner object) {
		super.delete(object);
	}
}
