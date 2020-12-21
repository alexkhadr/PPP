package tests;

import model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentsTest {

    Student student = new Student("Alex Khadra", 99130759);

    @BeforeEach
    void setBefore() {
    }

    @Test
    void testGetName() {
        assertEquals("Alex Khadra", student.getName());
    }

    @Test
    void testGetId() {
        assertEquals(99130759, student.getId());
    }
}
