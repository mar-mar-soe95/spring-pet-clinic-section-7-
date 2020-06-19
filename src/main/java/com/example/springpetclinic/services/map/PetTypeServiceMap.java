package com.example.springpetclinic.services.map;

import com.example.springpetclinic.models.PetType;
import com.example.springpetclinic.services.CrudService;
import com.example.springpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType,Long> implements PetTypeService {
    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }
}
