package com.sachit.learn.sppetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.sachit.learn.sppetclinic.model.Owner;
import com.sachit.learn.sppetclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{

	@Override
	public Owner save(Owner owner) {
		return super.save( owner);
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
	
	void deleteById(Long id) {
		super.deleteById(id);
	}
	
	void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public Owner findByLastName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
