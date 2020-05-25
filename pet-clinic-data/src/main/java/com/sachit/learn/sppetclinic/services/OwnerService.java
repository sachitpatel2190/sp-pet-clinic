package com.sachit.learn.sppetclinic.services;

import com.sachit.learn.sppetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String name);

}