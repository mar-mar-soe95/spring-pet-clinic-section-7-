package com.example.springpetclinic.services.map;

import com.example.springpetclinic.models.Speciality;
import com.example.springpetclinic.models.Vet;
import com.example.springpetclinic.services.SpecialityService;
import com.example.springpetclinic.services.VetService;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

    private  final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        if(object.getSpeacilitySet().size() > 0){
           object.getSpeacilitySet().forEach(speciality -> {
               if(speciality.getId() == null){
                   Speciality savedSpeciality = specialityService.save(speciality);
                   speciality.setId(savedSpeciality.getId());
               }
           });
        }

        return super.save(object);
    }
}
