package com.sachit.learn.sppetclinic.services.springjpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sachit.learn.sppetclinic.model.PetType;
import com.sachit.learn.sppetclinic.repository.PetTypeRepository;
import com.sachit.learn.sppetclinic.services.PetTypeService;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService{

	private final PetTypeRepository petTypeRepository;
	
	public  PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
		this.petTypeRepository = petTypeRepository;		
	}
	@Override
	public PetType findById(Long id) {
		return this.petTypeRepository.findById(id).orElse(null);
	}

	@Override
	public PetType save(PetType petType) {
		return this.petTypeRepository.save(petType);
	}

	@Override
	public Set<PetType> findAll() {
		Set<PetType> petTypes = new HashSet<PetType>();
		this.petTypeRepository.findAll().forEach(petTypes::add);
		return petTypes;
	}

	@Override
	public void deleteById(Long id) {
		this.petTypeRepository.deleteById(id);
	}

	@Override
	public void delete(PetType object) {
		this.petTypeRepository.delete(object);	
	}

}
