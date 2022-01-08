package com.admob.myhelperandroid.pass_data;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.Fragment;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.admob.myhelperandroid.R;

public class Pass_DataByFragment extends AppCompatActivity {
    FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_data_by_fragment);

        //initial frameLayout
        frameLayout=findViewById(R.id.pass_data_frameLayout_id);


        //to set senderFragment as a default fragment 
        getSupportFragmentManager().beginTransaction().replace(R.id.pass_data_frameLayout_id,new SenderFragment()).commit();

    }
}