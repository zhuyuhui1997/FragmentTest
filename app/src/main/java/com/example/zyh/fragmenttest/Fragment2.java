package com.example.zyh.fragmenttest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by zyh on 16-7-14.
 */
public class Fragment2 extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancestate) {
        return inflater.inflate(R.layout.fragment2, container, false);

    }

    public void onActivityCreate(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        Button button = (Button) getActivity().findViewById(R.id.fragment2_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView =(TextView)getActivity().findViewById(R.id.fragment1_text);
                Toast.makeText(getActivity(),textView.getText(), Toast.LENGTH_LONG).show();

            }
        });
    }


}

