package com.example.studentmanageapp;

public class Student {
    private String FullName;
    private int Birthday;
    private String Address;
    private String Email;

    public Student(String fullName, int birthday, String address, String email) {
        FullName = fullName;
        Birthday = birthday;
        Address = address;
        Email = email;
    }

    public String getFullName() {
        return FullName;
    }

    public int getBirthday() {
        return Birthday;
    }

    public String getAddress() {
        return Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public void setBirthday(int birthday) {
        Birthday = birthday;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
