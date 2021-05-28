package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {

    private String name;
    private String species;
    private List<String> vaccinations = new ArrayList<>();

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
        vaccinations.add("Rabies");
        vaccinations.add("Super Rabies");
        vaccinations.add("Ultra Rabies");
        vaccinations.add("Rabiesnado");
        vaccinations.add("Rabies 2: Electric Boogaloo");
    }

    public String listVaccinations() {
        String vaccinationList = "";

        for (String str : vaccinations) {
            vaccinationList += str + ", ";
        }

        vaccinationList = vaccinationList.substring(0, vaccinationList.length() - 2);

        return vaccinationList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<String> vaccinations) {
        this.vaccinations = vaccinations;
    }
}
