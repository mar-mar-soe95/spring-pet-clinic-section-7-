package com.example.springpetclinic.bootstrap;

import com.example.springpetclinic.models.*;
import com.example.springpetclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final PetService petService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, PetService petService, VetService vetService,
                      PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.petService = petService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType petType1 = new PetType();
        petType1.setName("Dog");
        PetType savedPetType1 = petTypeService.save(petType1);
        System.out.println("PetType 1 " + savedPetType1);

        PetType petType2 = new PetType();
        petType1.setName("Cat");
        PetType savePetType2 = petTypeService.save(petType2);


        System.out.println("PetType Data Loaded ................");

        Speciality radiology = new Speciality();
        radiology.setDescription("radiology");
        Speciality saveRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        radiology.setDescription("surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentisty = new Speciality();
        radiology.setDescription("dentisty");
        Speciality savedDentisty = specialityService.save(dentisty);

        System.out.println("Speciality Data Loaded ................");

        Owner owner1= new Owner();
        owner1.setFirstName("Mar");
        owner1.setLastName("Soe");
        owner1.setAddress("ZeyaTheiti 2");
        owner1.setCity("Hlaing");
        owner1.setTelephone("09435277189");

        Pet aungnet = new Pet();
        aungnet.setName("Just Dog");
        aungnet.setPetType(savedPetType1);
        aungnet.setOwner(owner1);
        aungnet.setBirthDate(LocalDate.now());
        owner1.getPets().add(aungnet);

        ownerService.save(owner1);

        Owner owner2= new Owner();
        owner2.setFirstName("Zi");
        owner2.setLastName("Sar");
        owner2.setAddress("ZeyaTheiti 2");
        owner2.setCity("Yankin");
        owner2.setTelephone("09435277189");

        Pet shwewar = new Pet();
        shwewar.setName("Just Cat");
        shwewar.setPetType(savePetType2);
        shwewar.setOwner(owner2);
        shwewar.setBirthDate(LocalDate.now());
        owner2.getPets().add(shwewar);

        ownerService.save(owner2);

        System.out.println("Owner Data Loaded.......");

        Vet vet1 =new Vet();
        vet1.setFirstName("Mar");
        vet1.setLastName("Lar");
        vet1.getSpeacilitySet().add(saveRadiology);

        vetService.save(vet1);

        Vet vet2 =new Vet();
        vet2.setFirstName("Mar");
        vet2.setLastName("Mar");
        vet2.getSpeacilitySet().add(savedSurgery);
        vetService.save(vet2);

        System.out.println("Vet Data Loaded..............");

    }
}
