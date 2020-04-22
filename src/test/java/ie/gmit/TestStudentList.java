package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStudentList {

    StudentList list;

    @BeforeEach
    void setup() {
        list = new StudentList();
    }

    @DisplayName("***********Testing list creation ***********")
    @Test
    void testAddStudentToList(){
        Student student1 = new Student("John", "john@gmit.ie");
        list.addStudentToList(student1);
        assertEquals(1, list.sizeOfList() );
    }

    @DisplayName("***********Testing list creation for two inserts ***********")
    @Test
    void testAddAnotherStudentToList(){
        Student student1 = new Student("John", "john@gmit.ie");
        Student student2 = new Student("Jack", "Jack@gmit.ie");
        list.addStudentToList(student1);
        list.addStudentToList(student2);
        assertEquals(2, list.sizeOfList() );
    }

    @DisplayName("***********Testing search list ***********")
    @Test
    void testFindStudentInList(){
        Student student1 = new Student("John", "john@gmit.ie");
        list.addStudentToList(student1);
        assertEquals(student1, list.findStudent("John") );
        assertEquals(null, list.findStudent("Michael") );
    }

}
