package com.thiraa.foodlabs.intro.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thiraa.foodlabs.R;


public class Fragment1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_quick_search, container, false);
        Button buttonInFragment1 = rootView.findViewById(R.id.button_1);
        buttonInFragment1.(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "button in fragment 1", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}