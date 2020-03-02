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
public class FragmentIngredients extends Fragment {

    public FragmentIngredients() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ingredients, container, false);
    }
}
