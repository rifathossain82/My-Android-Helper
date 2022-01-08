package com.admob.myhelperandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButton_demo extends AppCompatActivity {
    RadioButton radioButton,radioButton2,radioButton3;
    RadioGroup radioGroup,radioGroup2,radioGroup3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_demo);

        radioGroup=findViewById(R.id.radio_group_id);
        radioGroup2=findViewById(R.id.radio_group_id2);
        radioGroup3=findViewById(R.id.radio_group_id3);
    }

    public void ok_method(View view) {
        int x=radioGroup.getCheckedRadioButtonId();
        int y=radioGroup2.getCheckedRadioButtonId();
        int z=radioGroup3.getCheckedRadioButtonId();

        radioButton=findViewById(x);
        radioButton2=findViewById(y);
        radioButton3=findViewById(z);
        Toast.makeText(this, "Your select:\nDepartment: "+radioButton.getText()+"\nSemester: "+radioButton2.getText()+"\nShift: "+radioButton3.getText(), Toast.LENGTH_SHORT).show();
    }

    public void button_click(View view) {
        int x=radioGroup.getCheckedRadioButtonId();

        radioButton=findViewById(x);
        Toast.makeText(this, ""+radioButton.getText(), Toast.LENGTH_SHORT).show();
    }

    public void button_click2(View view) {
        int y=radioGroup2.getCheckedRadioButtonId();

        radioButton2=findViewById(y);
        Toast.makeText(this, ""+radioButton2.getText(), Toast.LENGTH_SHORT).show();

    }

    public void button_click3(View view) {
        int z=radioGroup3.getCheckedRadioButtonId();

        radioButton3=findViewById(z);
        Toast.makeText(this, ""+radioButton3.getText(), Toast.LENGTH_SHORT).show();


    }
}