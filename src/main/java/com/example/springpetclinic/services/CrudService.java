package com.example.springpetclinic.services;

import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public interface CrudService<T,ID> {
	
	T findById(Long id);
	
	Set<T> findAll();
	
	T save(T object);
	
	T delete();
	
	T deleteById(Long id);

}
