package com.thiraa.foodlabs.detail.fragment;

import android.content.Context;
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
public class FragmentDirections extends Fragment {

    public ResponseDetails.DataEntity responseDetailData;
    TextView tvOne, tvTwo, tvThree, tvTitleOne, tvTitleTwo, tvTitleThree, tvKetOne, tvKetTwo, tvKetThree;

    public FragmentDirections() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_directions, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setView(view);
        setData();
    }

    private void setView(View view) {
        tvOne = view.findViewById(R.id.tvOne);
        tvTitleOne = view.findViewById(R.id.tvTitleOne);
        tvKetOne = view.findViewById(R.id.tvKetOne);
        tvTwo = view.findViewById(R.id.tvTwo);
        tvTitleTwo = view.findViewById(R.id.tvTitleTwo);
        tvKetTwo = view.findViewById(R.id.tvKetTwo);
        tvThree = view.findViewById(R.id.tvThree);
        tvTitleThree = view.findViewById(R.id.tvTitleThree);
        tvKetThree = view.findViewById(R.id.tvKetThree);
    }

    private void setData() {
        tvTitleOne.setText(responseDetailData.getRecipe_cook_step().get(0).getCook_step_title());
        tvTitleTwo.setText(responseDetailData.getRecipe_cook_step().get(1).getCook_step_title());
        tvTitleThree.setText(responseDetailData.getRecipe_cook_step().get(2).getCook_step_title());
        tvKetOne.setText(responseDetailData.getRecipe_cook_step().get(0).getCook_step_desc());
        tvKetTwo.setText(responseDetailData.getRecipe_cook_step().get(1).getCook_step_desc());
        tvKetThree.setText(responseDetailData.getRecipe_cook_step().get(2).getCook_step_desc());
    }
}
