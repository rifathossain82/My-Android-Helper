package com.admob.myhelperandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class Toast_message_Demo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_message_demo);
    }

    public void simple_toast_message(View view) {
        Toast.makeText(this, "Simple Toast Message.", Toast.LENGTH_SHORT).show();
    }

    public void gravity_toast_message(View view) {
        /*
        in this type of toast message, I create a Toast object.
        And the show() will be the next of gravity setting
         */
        Toast toast=Toast.makeText(this, "Toast message with gravity.", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0); //we can show toast message in top,bottom,left side , right side etc. now I show in center
        toast.show();
    }

    public void custom_toast_message(View view) {
        /*
        This is a custom toast message.
        here R.layout.custom_layout is a layout for showing message.
        R.id.toast_layout is a id from custom_layout
         */
        LayoutInflater layoutInflater=getLayoutInflater();
        View view1=layoutInflater.inflate(R.layout.custom_layout,(ViewGroup) findViewById(R.id.toast_layout));

        Toast toast=new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(view1);
        toast.show();
    }
}