package com.sachit.learn.sppetclinic.services;

import java.util.Set;

public interface CrudService <T, Id>{
	
	T findById(Id id);
	
	T save(T pet);
	
	Set<T> findAll();
	
	void deleteById(Id id) ;
	
	void delete(T object) ;

}
