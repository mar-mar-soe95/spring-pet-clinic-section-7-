package com.example.springpetclinic.services;


import com.example.springpetclinic.models.Owner;
import org.springframework.stereotype.Service;

@Service
public interface OwnerService extends CrudService<Owner, Long>{
	
  Owner findBylastName(String lastName);


}
