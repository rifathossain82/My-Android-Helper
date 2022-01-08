package com.admob.myhelperandroid.pass_data;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.admob.myhelperandroid.R;

public class ReceiverFragment extends Fragment {
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_receiver, container, false);

        //initial textview
        textView=view.findViewById(R.id.textview_id_receiverFragment);

        //receive data from senderFragment
        String s=getArguments().getString("data");


        //to set data in textView
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(s);
            }
        });

        return view;
    }
}