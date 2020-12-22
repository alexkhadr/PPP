package tests;

import model.Internship;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InternshipsTest {

    Internship internship = new Internship("Microsoft", "April 3rd", Internship.Status.Accepted,
            Internship.EducationRequirement.Diploma, "3rd Year");
    Internship internship2 = new Internship("Microsoft", "April 3rd", Internship.Status.Rejected,
            Internship.EducationRequirement.Bachelors, "3rd Year");
    Internship internship3 = new Internship("Microsoft", "April 3rd", Internship.Status.UnderReview,
            Internship.EducationRequirement.Masters, "3rd Year");

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
        assertEquals("Accepted", internship.getStatus());
        assertEquals("Rejected", internship2.getStatus());
        assertEquals("UnderReview", internship3.getStatus());
    }

    @Test
    void getEducationRequirement() {
        assertEquals("Diploma", internship.getEducationRequirement());
        assertEquals("Bachelors", internship2.getEducationRequirement());
        assertEquals("Masters", internship3.getEducationRequirement());
    }

    @Test
    void getYearRequirement() {
        assertEquals("3rd Year", internship.getYearRequirement());
    }

    @Test
    void setStatusTest() {
        Internship.Status s = Internship.Status.Accepted;
        internship3.setStatus(s);
        assertEquals("Accepted", internship3.getStatus());
    }
}
