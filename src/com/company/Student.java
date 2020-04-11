package com.company;

public class Student {

    public Student(final String name, final String department) {
        this.name = name;
        this.department = department;
        DataBase.getInstance().addStudent(this);
    }


    private String name;
    private String department;
    private String username;
    private String password;

    public void register(String username, String password, String confirmPassword) {
        if (this.username != null) {
            System.out.println("already registered");
            return;
        }

        if (!password.equals(confirmPassword)) {
            System.out.println("password not match");
            return;
        }

        this.username = username;
        this.password = password;
        System.out.println(this.getName() + " registered successfully");
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public boolean isAuth(String password) {
        return this.password.equals(password);
    }
}
