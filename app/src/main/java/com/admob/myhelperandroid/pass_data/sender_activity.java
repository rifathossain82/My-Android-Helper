package com.admob.myhelperandroid.pass_data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.admob.myhelperandroid.R;

public class sender_activity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);

        editText=findViewById(R.id.editText_id_SenderActivity);
    }

    public void send_myData(View view) {
        String s=editText.getText().toString();
        if(s.isEmpty()){
            editText.setError("Null Data!!");
            editText.requestFocus();
        }
        else{
            Intent it=new Intent(sender_activity.this,receiver_activity.class);
            it.putExtra("data",s);
            startActivity(it);
        }
    }
}