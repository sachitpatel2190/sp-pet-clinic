package com.sachit.learn.sppetclinic.services.springjpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sachit.learn.sppetclinic.model.Pet;
import com.sachit.learn.sppetclinic.repository.PetRepository;
import com.sachit.learn.sppetclinic.services.PetService;

@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService{

	private final PetRepository petRepository;
	
	public  PetSDJpaService(PetRepository petRepository) {
		this.petRepository = petRepository;		
	}
	@Override
	public Pet findById(Long id) {
		return this.petRepository.findById(id).orElse(null);
	}

	@Override
	public Pet save(Pet pet) {
		return this.petRepository.save(pet);
	}

	@Override
	public Set<Pet> findAll() {
		Set<Pet> pets = new HashSet<Pet>();
		this.petRepository.findAll().forEach(pets::add);
		return pets;
	}

	@Override
	public void deleteById(Long id) {
		this.petRepository.deleteById(id);
	}

	@Override
	public void delete(Pet object) {
		this.petRepository.delete(object);	
	}

}
