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
        String input = "Rabies, Super Rabies, Ultra Rabies, Rabiesnado, Rabies 2: Electric Boogaloo";

        String output = objectUnderTest.listVaccinations();

        Assert.assertEquals(input, output);
    }


}
