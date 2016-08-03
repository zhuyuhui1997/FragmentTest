package com.example.zyh.fragmenttest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by zyh on 16-7-14.
 */
public class Fragment1 extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancestate)
    {
        return inflater.inflate(R.layout.fragment1,container,false);

    }
}
