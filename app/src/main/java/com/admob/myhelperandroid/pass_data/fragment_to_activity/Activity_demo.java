package com.admob.myhelperandroid.pass_data.fragment_to_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.admob.myhelperandroid.R;
import com.admob.myhelperandroid.pass_data.SenderFragment;

public class Activity_demo extends AppCompatActivity {
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        //initial frameLayout
        frameLayout=findViewById(R.id.demo_frameLayout_pass_data_id);

        //to set fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.demo_frameLayout_pass_data_id,new Sender_fragment()).commit();
    }
}