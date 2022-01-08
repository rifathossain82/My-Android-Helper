package com.admob.myhelperandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Textview_Demo extends AppCompatActivity {
    TextView textView1,textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textview_demo);

        //initial textview
        textView1=findViewById(R.id.tvDemo1);
        textView2=findViewById(R.id.tvDemo2);
        textView3=findViewById(R.id.tvDemo3);

        //set on click listener
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Textview_Demo.this, ""+textView1.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Textview_Demo.this, ""+textView2.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Textview_Demo.this, ""+textView3.getText(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}