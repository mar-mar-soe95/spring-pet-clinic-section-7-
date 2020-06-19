package com.example.springpetclinic.models;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person{

    private Set<Speciality> speacilitySet = new HashSet<>();


    public Set<Speciality> getSpeacilitySet() {
        return speacilitySet;
    }

    public void setSpeacilitySet(Set<Speciality> speacilitySet) {
        this.speacilitySet = speacilitySet;
    }




}
