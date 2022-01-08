package com.admob.myhelperandroid.pass_data.fragment_to_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.admob.myhelperandroid.R;

public class Receiver_Activity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver2);

        //initial textView
        textView=findViewById(R.id.textview_id_receiverFragment_FA);

        //to receiver data from sender_fragment
        String s=getIntent().getStringExtra("data");

        //to set data in textview
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(s);
            }
        });
    }
}