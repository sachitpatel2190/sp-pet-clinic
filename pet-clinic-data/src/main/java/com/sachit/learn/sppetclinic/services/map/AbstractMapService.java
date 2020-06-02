package com.sachit.learn.sppetclinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import com.sachit.learn.sppetclinic.model.BaseEntity;
import com.sachit.learn.sppetclinic.services.CrudService;

public abstract class AbstractMapService<T extends BaseEntity, Id extends Long> implements CrudService<T, Id>{

	protected Map<Long, T> map = new HashMap<Long, T>();

	public T findById(Id id) {
		return map.get(id);
	}

	public T save(T object) {
		
		if(object != null) {
			if(object.getId() == null){
				object.setId(getNextId());
			}
			
			map.put(object.getId(), object);
		} else {
			throw new RuntimeException("Object Can not be null");
		}



		return object;

	}
	
	
	public Set<T> findAll() {

		return new HashSet<T>(map.values());
	}
	
	public void deleteById(Id id) {
		map.remove(id);
	}
	
	public void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}

	private Long getNextId() {
		Long nextEle = null;
		
		try {
			nextEle = Collections.max(map.keySet()) + 1L;
		} catch (NoSuchElementException e) {
			
			nextEle = 1L;
		}
		 
		return nextEle;
	}
}
