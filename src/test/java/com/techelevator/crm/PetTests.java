package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTests {

    private Pet objectUnderTest;

    @Before
    public void setObjectUnderTest() {
        objectUnderTest = new Pet("Test Name", "Test Species");
    }

    @Test
    public void vaccinations_list_displays_5_vaccinations() {
        String expected = "Rabies, Super Rabies, Ultra Rabies, Rabiesnado, Rabies 2: Electric Boogaloo";

        List<String> testList = new ArrayList<>();
        testList.add("Rabies");
        testList.add("Super Rabies");
        testList.add("Ultra Rabies");
        testList.add("Rabiesnado");
        testList.add("Rabies 2: Electric Boogaloo");

        objectUnderTest.setVaccinations(testList);

        String output = objectUnderTest.listVaccinations();

        Assert.assertEquals(expected, output);
    }

    @Test
    public void vaccinations_list_displays_1_vaccination() {
        String expected = "Cuteness Overload Disease";

        List<String> testList = new ArrayList<>();
        testList.add("Cuteness Overload Disease");

        objectUnderTest.setVaccinations(testList);

        String output = objectUnderTest.listVaccinations();

        Assert.assertEquals(expected, output);
    }

    @Test
    public void empty_vaccinations_list_displays_0_vaccinations() {
        String expected = "";

        List<String> testList = new ArrayList<>();

        objectUnderTest.setVaccinations(testList);

        String output = objectUnderTest.listVaccinations();

        Assert.assertEquals(expected, output);
    }


}
