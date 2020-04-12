package com.example.studentmanageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements StudentProfile {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void DataStudent(Student student) {
        FragmentStudentInfo fragmentStudentInfo = (FragmentStudentInfo) getSupportFragmentManager().findFragmentById(R.id.fragmentInfo);
        fragmentStudentInfo.SetInfo(student);

    }
}
