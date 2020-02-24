package ie.gmit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStudent {

    Student student;


    @DisplayName("***********Testing creation of student Object ***********")
    @Test
    void testConstructorStudent(){

        student = new Student("John", "john@gmit.ie");
        assertEquals("John", student.getName());
    }

}
