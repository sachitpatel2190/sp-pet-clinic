package com.sachit.learn.sppetclinic.repository;

import org.springframework.data.repository.CrudRepository;

import com.sachit.learn.sppetclinic.model.Visit;
import com.sachit.learn.sppetclinic.services.CrudService;

public interface VisitRepository extends CrudRepository<Visit, Long>{ 

}
