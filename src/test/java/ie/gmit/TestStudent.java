package ie.gmit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestStudent {
/*
OPEN FILE IN FILE EXPLORER->RIGHT CLICK->GIT BASH->GIT INIT
VCS -> GIT->REMOTES*/

    Student student;


    @DisplayName("***********Testing creation of student Object name ***********")
    @Test
    void testConstructorStudentName(){

        student = new Student("John", "john@gmit.ie");
        assertEquals("John", student.getName());
    }
    @DisplayName("***********Testing creation of student Object email ***********")
    @Test
    void testConstructorStudentEmail(){

        student = new Student("John", "john@gmit.ie");
        assertEquals("john@gmit.ie", student.getEmail());
    }

    @DisplayName("***********Testing creation of student Object without name ***********")
    @Test
    void testConstructorNoName(){

        assertThrows(IllegalArgumentException.class,()-> new Student("", "john@gmit.ie"));
    }

    @DisplayName("***********Testing creation of student Object without name ***********")
    @Test
    void testConstructorNoEmail(){

        assertThrows(IllegalArgumentException.class,()-> new Student("John", ""));
    }

}
