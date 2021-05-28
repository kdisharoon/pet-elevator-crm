package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {

<<<<<<< HEAD
=======
    // ## INSTANCE VARIABLES ##

>>>>>>> 32d2e4efe0d558330fbcb8b0f7e855f501d2a9ad
    private String name;
    private String species;
    private List<String> vaccinations = new ArrayList<>();

<<<<<<< HEAD
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
=======
    // ## GETTERS AND SETTERS ##
>>>>>>> 32d2e4efe0d558330fbcb8b0f7e855f501d2a9ad

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
<<<<<<< HEAD
=======

    // ## CONSTRUCTORS ##

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    // ## METHODS ##

    public String listVaccinations() {
        String output = "";
        for (String vax : vaccinations) {
            output += vax + ", ";
        }
        output = output.substring(0, output.length() - 2);
        return output;
    }

>>>>>>> 32d2e4efe0d558330fbcb8b0f7e855f501d2a9ad
}
