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
import com.thiraa.foodlabs.detail.models.ResponseDetails;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentIngredients extends Fragment {

    public ResponseDetails.DataEntity responseDetailData;
    TextView tvIngOne, tvIngTwo, tvIngThree;

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
        setData();
    }

    private void setView(View view) {
        tvIngOne = view.findViewById(R.id.tvIngOne);
        tvIngTwo = view.findViewById(R.id.tvIngTwo);
        tvIngThree = view.findViewById(R.id.tvIngThree);
    }

    private void setData() {
        tvIngOne.setText(responseDetailData.getRecipe_ingridients().get(0).getIngridients_desc());
        tvIngTwo.setText(responseDetailData.getRecipe_ingridients().get(1).getIngridients_desc());
        tvIngThree.setText(responseDetailData.getRecipe_ingridients().get(2).getIngridients_desc());
    }
}
