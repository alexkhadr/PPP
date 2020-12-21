package tests;

import model.Internship;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InternshipsTest {

    Internship internship = new Internship("Microsoft", "April 3rd", "Accepted",
            "Bachelors", "3rd Year");

    @BeforeEach
    void setUp() {

    }

    @Test
    void testGetName() {
        assertEquals("Microsoft", internship.getName());
    }

    @Test
    void testGetDueDate() {
        assertEquals("April 3rd", internship.getDueDate());
    }

    @Test
    void testGetStatus() {
        assertEquals("Accepted", internship.getStatus());  //todo: test for changing status
    }

    @Test
    void getEducationRequirement() {
        assertEquals("Bachelors", internship.getEducationRequirement());
    }

    @Test
    void getYearRequirement() {
        assertEquals("3rd Year", internship.getYearRequirement());
    }
}
