package com.sachit.learn.sppetclinic.services.springjpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sachit.learn.sppetclinic.model.Vet;
import com.sachit.learn.sppetclinic.repository.VetsRepository;
import com.sachit.learn.sppetclinic.services.VetService;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService{

	private final VetsRepository vetRepository;
	public  VetSDJpaService(VetsRepository vetRepository) {
		this.vetRepository = vetRepository;		
	}
	@Override
	public Vet findById(Long id) {
		return this.vetRepository.findById(id);
	}

	@Override
	public Vet save(Vet vet) {
		return this.vetRepository.save(vet);
	}

	@Override
	public Set<Vet> findAll() {
		Set<Vet> vets = new HashSet<Vet>();
		this.vetRepository.findAll().forEach(vets::add);
		return vets;
	}

	@Override
	public void deleteById(Long id) {
		this.vetRepository.deleteById(id);
	}

	@Override
	public void delete(Vet object) {
		this.vetRepository.delete(object);	
	}

}
