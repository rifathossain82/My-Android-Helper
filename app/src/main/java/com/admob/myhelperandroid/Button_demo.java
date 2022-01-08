package com.admob.myhelperandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Button_demo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_demo);
    }

    public void save_btn1(View view) {
        Toast.makeText(this, "Normal button.", Toast.LENGTH_SHORT).show();
    }

    public void save_btn2(View view) {
        Toast.makeText(this, "Simple design", Toast.LENGTH_SHORT).show();
    }

    public void save_btn3(View view) {
        Toast.makeText(this, "Radius & solid color", Toast.LENGTH_SHORT).show();
    }

    public void save_btn4(View view) {
        Toast.makeText(this, "Circle button.", Toast.LENGTH_SHORT).show();
    }

    public void save_btn5(View view) {
        Toast.makeText(this, "Button with stroke without solid", Toast.LENGTH_SHORT).show();
    }

    public void save_btn6(View view) {
        Toast.makeText(this, "Radial style custom gradiant button", Toast.LENGTH_SHORT).show();
    }

    public void save_btn7(View view) {
        Toast.makeText(this, "Simple Gradiant button.", Toast.LENGTH_SHORT).show();
    }
}