package com.sachit.learn.sppetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.sachit.learn.sppetclinic.services.CrudService;

public abstract class AbstractMapService<T, Id> implements CrudService<T, Id>{

	protected Map<Id, T> map = new HashMap<Id, T>();

	public T findById(Id id) {
		return map.get(id);
	}

	T save(Id id, T object) {

		map.put(id, object);

		return object;

	}
	
	
	public Set<T> findAll() {

		return new HashSet<T>(map.values());
	}
	
	void deleteById(Id id) {
		map.remove(id);
	}
	
	void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}

}
