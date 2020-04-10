package com.company;

public class Main {

    public static void main(String[] args) {
        Student ahmad = new Student("ahmad", "SWE");
        System.out.println(ahmad.getName());
        System.out.println(ahmad.getDepartment());
        ahmad.register("Mahmad", "password", "password");
        login("Mahmad", "password");
    }


    public static void login(String username, String password) {
        Student student = DataBase.getInstance().getStudentByUsername(username);
        if (student != null && student.isAuth(password)) {
            System.out.println("Logged in");
        } else {
            System.out.println("username or password is not correct");
        }
    }
}
