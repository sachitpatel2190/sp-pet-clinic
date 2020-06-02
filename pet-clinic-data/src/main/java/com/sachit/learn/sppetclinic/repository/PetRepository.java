package com.sachit.learn.sppetclinic.repository;

import org.springframework.data.repository.CrudRepository;

import com.sachit.learn.sppetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long>{ 

}
