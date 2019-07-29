package com.rahulografy.brgcdemoapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rahulografy.brgcdemoapp.R;
import com.rahulografy.brgcdemoapp.data.Student;

import java.util.List;

public class StudentListAdapter
        extends RecyclerView.Adapter<StudentListAdapter.StudentViewHolder> {

    // private Context context;
    private List<Student> listStudent;
    // private LayoutInflater layoutInflater;

    public StudentListAdapter(Context context, List<Student> listStudent) {
        // this.layoutInflater = LayoutInflater.from(context);
        // this.context = context;
        this.listStudent = listStudent;
    }

    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // View view = layoutInflater.inflate(R.layout.list_item_student, parent, false);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_student, parent, false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StudentViewHolder studentViewHolder, int position) {

        studentViewHolder.ivPhoto.setImageResource(R.mipmap.ic_launcher);
        studentViewHolder.tvName.setText(listStudent.get(position).getName());
        studentViewHolder.tvRollNum.setText(listStudent.get(position).getRollNum());
    }

    @Override
    public int getItemCount() {
        return listStudent.size();
    }

    class StudentViewHolder extends RecyclerView.ViewHolder {

        ImageView ivPhoto;
        TextView tvName, tvRollNum;

        StudentViewHolder(View itemView) {
            super(itemView);

            ivPhoto = itemView.findViewById(R.id.iv_student_photo);
            tvName = itemView.findViewById(R.id.tv_student_name);
            tvRollNum = itemView.findViewById(R.id.tv_student_roll_num);
        }
    }
}