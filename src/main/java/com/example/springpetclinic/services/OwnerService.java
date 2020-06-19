package com.example.springpetclinic.services;

import com.example.springpetclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
  Owner findBylastName(String lastName);


}
