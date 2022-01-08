package com.admob.myhelperandroid.pass_data;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.admob.myhelperandroid.R;
public class SenderFragment extends Fragment {
    EditText editText;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sender, container, false);

        //initial edittext and button
        editText=view.findViewById(R.id.editText_id_SenderFragment);
        button=view.findViewById(R.id.send_id_senderFragment);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editText.getText().toString();
                if(s.isEmpty()){
                    editText.setError("Null Data!!!");
                    editText.requestFocus();
                }
                else{
                    Bundle bundle=new Bundle(); //we use bundle to send data from fragment to fragment
                    bundle.putString("data",s);

                    ReceiverFragment receiverFragment=new ReceiverFragment();
                    receiverFragment.setArguments(bundle);
                    getFragmentManager().beginTransaction().replace(R.id.pass_data_frameLayout_id,receiverFragment).commit();

                }
            }
        });


        return view;
    }
}