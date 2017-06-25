package com.example.gigaw.gemmountainapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/**
 * Created by gigaw on 6/24/2017.
 */

public class GemFragment extends Fragment {
    private Gems mGem;
    private CheckBox mFoundCheckBox;
    private RecyclerView mGemRecyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mGem = new Gems();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_stones, container, false);
        mFoundCheckBox = (CheckBox)v.findViewById(R.id.gem_found);
        mFoundCheckBox.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mGem.setFound(isChecked);
            }
        });
        return v;
    }


}
