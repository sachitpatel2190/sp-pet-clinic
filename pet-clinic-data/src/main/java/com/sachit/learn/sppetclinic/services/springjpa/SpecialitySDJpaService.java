package com.sachit.learn.sppetclinic.services.springjpa;


import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sachit.learn.sppetclinic.model.Speciality;
import com.sachit.learn.sppetclinic.repository.SpecialityRepository;
import com.sachit.learn.sppetclinic.services.SpecialityService;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialityService{

	private final SpecialityRepository specialityRepository;
	
	public  SpecialitySDJpaService(SpecialityRepository specialityRepository) {
		this.specialityRepository = specialityRepository;		
	}
	@Override
	public Speciality findById(Long id) {
		return this.specialityRepository.findById(id).orElse(null);
	}

	@Override
	public Speciality save(Speciality speciality) {
		return this.specialityRepository.save(speciality);
	}

	@Override
	public Set<Speciality> findAll() {
		Set<Speciality> specialitys = new HashSet<Speciality>();
		this.specialityRepository.findAll().forEach(specialitys::add);
		return specialitys;
	}

	@Override
	public void deleteById(Long id) {
		this.specialityRepository.deleteById(id);
	}

	@Override
	public void delete(Speciality object) {
		this.specialityRepository.delete(object);	
	}

}
