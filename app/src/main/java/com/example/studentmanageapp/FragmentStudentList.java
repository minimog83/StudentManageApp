package com.example.studentmanageapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import com.example.studentmanageapp.R;

import java.util.ArrayList;

public class FragmentStudentList extends ListFragment {


    ArrayList<Student> arrayStudent;
    StudentAdapter adapter;
    StudentProfile studentProfile;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        studentProfile = (StudentProfile) getActivity();
        arrayStudent = new ArrayList<>();
        AddArrayStudent();
        adapter = new StudentAdapter(getActivity(),R.layout.row_student,arrayStudent);
        setListAdapter(adapter);

        return inflater.inflate(R.layout.fragment_student_list,container,false);
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        studentProfile.DataStudent(arrayStudent.get(position));

    }

    private void AddArrayStudent() {
        arrayStudent.add(new Student("昭　鳥山",1955,"愛知県","toriyama@mail.com"));
        arrayStudent.add(new Student("速雄　宮崎",1941,"東京都","miyazaki@mail.com"));
        arrayStudent.add(new Student("青山　剛昌",1963,"鳥取県","gosho@mail.com"));
        arrayStudent.add(new Student("岸本　斉史",1974,"岡山県","masashi@mail.com"));
        arrayStudent.add(new Student("尾田 栄一郎",1975,"東京都","eiichiro@mail.com"));
        arrayStudent.add(new Student("チャン・チョン・ホアイ",1983,"東京都","mail@mail.com"));
    }
}
