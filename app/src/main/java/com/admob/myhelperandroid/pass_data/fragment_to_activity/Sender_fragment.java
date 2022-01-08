package com.admob.myhelperandroid.pass_data.fragment_to_activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.admob.myhelperandroid.R;
import com.admob.myhelperandroid.pass_data.ReceiverFragment;

public class Sender_fragment extends Fragment {
    EditText editText;
    Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sender_fragment, container, false);

        //initial edittext and button
        editText=view.findViewById(R.id.editText_id_SenderFragment_FA);
        button=view.findViewById(R.id.send_id_senderFragment_FA);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editText.getText().toString();
                if(s.isEmpty()){
                    editText.setError("Null Data!!!");
                    editText.requestFocus();
                }
                else{
                    Intent it=new Intent(getContext(),Receiver_Activity.class);
                    it.putExtra("data",s);
                    startActivity(it);
                   }
            }
        });

        return view;
    }
}