package com.example.springpetclinic.services;

import org.springframework.stereotype.Service;

@Service
public interface PetService<Pet> extends CrudService<Pet, Long>{
}
