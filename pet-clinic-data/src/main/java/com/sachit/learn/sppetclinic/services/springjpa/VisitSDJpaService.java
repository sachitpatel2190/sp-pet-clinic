package com.sachit.learn.sppetclinic.services.springjpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.sachit.learn.sppetclinic.model.Visit;
import com.sachit.learn.sppetclinic.repository.VisitRepository;
import com.sachit.learn.sppetclinic.services.VisitService;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService{

	private final VisitRepository visitRepository;
	
	public  VisitSDJpaService(VisitRepository visitRepository) {
		this.visitRepository = visitRepository;		
	}
	
	
	@Override
	public Visit findById(Long id) {
		return this.visitRepository.findById(id).orElse(null);
	}

	@Override
	public Visit save(Visit Visit) {
		return this.visitRepository.save(Visit);
	}

	@Override
	public Set<Visit> findAll() {
		Set<Visit> Visits = new HashSet<Visit>();
		this.visitRepository.findAll().forEach(Visits::add);
		return Visits;
	}

	@Override
	public void deleteById(Long id) {
		this.visitRepository.deleteById(id);
	}

	@Override
	public void delete(Visit object) {
		this.visitRepository.delete(object);	
	}

}
