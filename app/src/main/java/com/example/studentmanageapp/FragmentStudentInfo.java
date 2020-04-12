package com.example.studentmanageapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static com.example.studentmanageapp.R.layout.fragment_student_info;

public class FragmentStudentInfo extends Fragment {

    TextView txtName, txtBirthday, txtAddress, txtMail;
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(fragment_student_info,container,false);
        Mapping();
        return view;
    }

    void SetInfo(Student student) {
        txtName.setText(student.getFullName());
        txtBirthday.setText("年：" + student.getBirthday());
        txtAddress.setText("場所：" + student.getAddress());
        txtMail.setText("メール：" + student.getEmail());
    }

    private void Mapping() {
        txtName = (TextView) view.findViewById(R.id.textviewName);
        txtBirthday = (TextView) view.findViewById(R.id.textviewBirthday);
        txtAddress = (TextView) view.findViewById(R.id.textviewAddress);
        txtMail = (TextView) view.findViewById(R.id.textviewEmail);
    }
}
