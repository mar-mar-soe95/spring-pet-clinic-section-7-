package com.example.springpetclinic.services;

import java.util.Set;

public interface CrudService<T,ID> {
	
	T findById(Long id);
	
	Set<T> findAll();
	
	T save(T object);
	
	void delete(T object);
	
	void deleteById(Long id);

}
