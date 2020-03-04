package com.thiraa.foodlabs.detail.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thiraa.foodlabs.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentIngredients extends Fragment {
    
    TextView tvIngOne, tvIngTwo, tvIngThree, tvIngFour;

    public FragmentIngredients() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ingredients, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        
        setView(view);
    }

    private void setView(View view) {
        tvIngOne = view.findViewById(R.id.tvIngOne);
        tvIngTwo = view.findViewById(R.id.tvIngTwo);
        tvIngThree = view.findViewById(R.id.tvIngThree);
        tvIngFour = view.findViewById(R.id.tvIngFour);
    }
}
