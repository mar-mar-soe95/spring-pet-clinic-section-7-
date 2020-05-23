package com.example.springpetclinic.models;

import java.util.Set;

public class Vet extends Person{

    public Set<Speacility> getSpeacilitySet() {
        return speacilitySet;
    }

    public void setSpeacilitySet(Set<Speacility> speacilitySet) {
        this.speacilitySet = speacilitySet;
    }

    private Set<Speacility> speacilitySet;



}
