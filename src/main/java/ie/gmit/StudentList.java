package ie.gmit;

import java.util.ArrayList;

public class StudentList {

    ArrayList<Student> studentList;

    public StudentList() {
       studentList = new ArrayList<>();
    }

    public void addStudentToList(Student student){
        studentList.add(student);
    }

    public int sizeOfList(){
       return studentList.size();
    }
}



