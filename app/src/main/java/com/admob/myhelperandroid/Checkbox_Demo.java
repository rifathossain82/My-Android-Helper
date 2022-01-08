package com.admob.myhelperandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Checkbox_Demo extends AppCompatActivity {
    CheckBox ch1,ch2,ch3,ch4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox_demo);

        //initial checkbox
        ch1=findViewById(R.id.checkbox_1);
        ch2=findViewById(R.id.checkbox_2);
        ch3=findViewById(R.id.checkbox_3);
        ch4=findViewById(R.id.checkbox_4);
    }

    public void next_method(View view) {
        StringBuilder stringBuilder=new StringBuilder();
        if (ch1.isChecked()){
            stringBuilder.append(ch1.getText().toString());
        }
        if (ch2.isChecked()){
            stringBuilder.append(", "+ch2.getText().toString());
        }
        if (ch3.isChecked()){
            stringBuilder.append(", "+ch3.getText().toString());
        }
        if (ch4.isChecked()){
            stringBuilder.append(", "+ch4.getText().toString());
        }

        Toast.makeText(this, ""+stringBuilder, Toast.LENGTH_SHORT).show();
    }
}