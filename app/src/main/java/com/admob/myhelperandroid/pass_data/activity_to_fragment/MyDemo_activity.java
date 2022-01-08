package com.admob.myhelperandroid.pass_data.activity_to_fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.admob.myhelperandroid.R;

public class MyDemo_activity extends AppCompatActivity {
    LinearLayout linearLayout;
    FrameLayout frameLayout;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_demo);

        //initial all content
        frameLayout=findViewById(R.id.frameLayout_id_AF);
        linearLayout=findViewById(R.id.content_id_AF);
        editText=findViewById(R.id.editText_id_AF);
        button=findViewById(R.id.go_fragment_id_AF);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editText.getText().toString();
                if(s.isEmpty()){
                    editText.setError("Null Data!!");
                    editText.requestFocus();
                }
                else{
                    Bundle bundle=new Bundle();
                    bundle.putString("data",s);

                    MyDemo_fragment fragment=new MyDemo_fragment();
                    fragment.setArguments(bundle);

                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_id_AF,fragment).commit();

                }
            }
        });
    }
}