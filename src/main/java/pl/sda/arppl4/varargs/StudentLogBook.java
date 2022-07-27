package pl.sda.arppl4.varargs;

import java.util.ArrayList;
import java.util.List;

public class StudentLogBook { // dziennik
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(String name){
        Student student = new Student(name);
        studentList.add(student);
    }

    // String... - VARARGS - Variable Number of Arguments
    // Variable     (zmienna)
    // Number of    (liczba)
    // Arguments    (argumentów/parametrów)
    public void addStudents(String... students){
        for (String name: students) {
            addStudent(name);
        }
    }
}
