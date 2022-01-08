package com.admob.myhelperandroid.pass_data.activity_to_fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.admob.myhelperandroid.R;
public class MyDemo_fragment extends Fragment {
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_my_demo_fragment, container, false);

        //initial textview
        textView=view.findViewById(R.id.textview_id_AF);
        return view;
    }
}