package com.admob.myhelperandroid.pass_data;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.admob.myhelperandroid.R;

public class receiver_activity extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);

        textView=findViewById(R.id.textview_id_receiverActivity);
        String s=getIntent().getStringExtra("data");
        textView.setText(s);
    }
}