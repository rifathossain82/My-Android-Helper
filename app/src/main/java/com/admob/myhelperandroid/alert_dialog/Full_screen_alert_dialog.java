package com.admob.myhelperandroid.alert_dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.admob.myhelperandroid.R;

public class Full_screen_alert_dialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_alert_dialog);
    }

    public void show_dialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(Full_screen_alert_dialog.this,R.style.full_screen_alert);
        View view1=getLayoutInflater().inflate(R.layout.full_screen_dialog_layout,null);
        builder.setView(view1);
        AlertDialog dialog=builder.create();
        dialog.show();

        //to dismiss alert dialog
        ImageView imageView=view1.findViewById(R.id.dish_image_id);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }
}