package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DataBase {

    private static DataBase dataBase;

    final List<Student> students;

    private DataBase() {
        students = new ArrayList<>();
    }

    public static DataBase getInstance() {
        if (dataBase == null) {
            dataBase = new DataBase();
        }
        return dataBase;
    }


    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudentByUsername(final String username) {
        if (username == null) {
            System.out.println("Student not exist");
            return null;
        }
        Optional<Student> student = students.stream().filter(s -> s.getUsername().equals(username)).findFirst();
        if (!student.isPresent()) {
            System.out.println("Student not exist");
            return null;
        }
        return student.get();
    }
}
