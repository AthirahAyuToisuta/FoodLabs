package com.thiraa.foodlabs.detail.models;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thiraa.foodlabs.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDirections extends Fragment {

    public FragmentDirections() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_directions, container, false);
    }
}
