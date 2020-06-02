package com.sachit.learn.sppetclinic.repository;

import org.springframework.data.repository.CrudRepository;

import com.sachit.learn.sppetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long>{ 

}
