package com.example.bai2_de2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
import java.util.zip.Inflater;

public class listviewAdapter extends ArrayAdapter<Student> {
    Activity activity;
    List<Student> stdlist;

    public listviewAdapter(Context context, List<Student> stdlist){
        super(context,R.layout.item);
        this.activity = (Activity)context;
        this.stdlist = stdlist;
    }

    public Student getStd(int position){
        return stdlist.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.item,parent,false);
        Student s = stdlist.get(position);
        ImageView imgview = view.findViewById(R.id.img_std);
        TextView textview1 = view.findViewById(R.id.tv_id);
        TextView textview2 = view.findViewById(R.id.tv_name);
        TextView textview3 = view.findViewById(R.id.tv_gender);
        TextView textview4 = view.findViewById(R.id.tv_dob);
        imgview.setImageResource(s.img);
        textview1.setText(s.getId());
        textview2.setText(s.getTen());
        textview3.setText(s.getGender());
        textview4.setText(s.getDob());
        return view;
    }
}
