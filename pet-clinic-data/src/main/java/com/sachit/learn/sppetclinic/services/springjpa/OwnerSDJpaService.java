package com.sachit.learn.sppetclinic.services.springjpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sachit.learn.sppetclinic.model.Owner;
import com.sachit.learn.sppetclinic.repository.OwnerRepository;
import com.sachit.learn.sppetclinic.services.OwnerService;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService{
	
	private final OwnerRepository ownerRepository;
	
	public OwnerSDJpaService(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}

	@Override
	public Owner findById(Long id) {
		Optional<Owner> ownerOptional = this.ownerRepository.findById(id);		
		return ownerOptional.orElse(null);
	}

	@Override
	public Owner save(Owner owner) {
		return this.ownerRepository.save(owner);
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<Owner>();
		this.ownerRepository.findAll().forEach(owners::add);
		return owners;
	}

	@Override
	public Owner findByLastName(String name) {
		return this.ownerRepository.findByLastName(name);
	}

	@Override
	public void deleteById(Long id) {
		this.ownerRepository.deleteById(id);
		
	}

	@Override
	public void delete(Owner object) {
		this.ownerRepository.delete(object);		
	}

}
