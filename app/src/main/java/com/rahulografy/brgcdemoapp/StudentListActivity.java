package com.rahulografy.brgcdemoapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.rahulografy.brgcdemoapp.adapter.StudentListAdapter;
import com.rahulografy.brgcdemoapp.data.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentListActivity extends AppCompatActivity {

    private int listStudentCount = 100;
    private TextView tvTitle;
    private RecyclerView rvStudentList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_student_list);
        listStudentCount = getIntent().getExtras().getInt("KEY_COUNT");
        bindViews();
        initViews();
    }

    private void bindViews() {
        tvTitle = findViewById(R.id.textview_student_list_title);
        rvStudentList = findViewById(R.id.recyclerview_student_list);
    }

    private void initViews() {
        rvStudentList.setLayoutManager(new LinearLayoutManager(this));
        rvStudentList.setAdapter(new StudentListAdapter(this, genStudentList(listStudentCount)));
        tvTitle.setText("Student List (" + listStudentCount + ")");
    }

    private List<Student> genStudentList(final int count) {

        List<Student> listStudent = new ArrayList<Student>(count);

        for (int i = 0; i < count; ++i) {
            Student student = new Student();
            student.setPhoto("URL");
            student.setName("John Doe #" + i);
            student.setRollNum(String.valueOf(i));
            listStudent.add(student);
        }
        return listStudent;
    }
}