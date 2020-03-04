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

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDirections extends Fragment {
    Context context;

    TextView tvOne, tvTwo, tvTitleOne, tvTitleTwo, tvKetOne, tvKetTwo ;

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

        context = getContext();
        setView(view);
        setEvent();
    }

    private void setView(View view) {
        tvOne = view.findViewById(R.id.tvOne);
        tvTitleOne = view.findViewById(R.id.tvTitleOne);
        tvKetOne = view.findViewById(R.id.tvKetOne);
        tvTwo = view.findViewById(R.id.tvTwo);
        tvTitleTwo = view.findViewById(R.id.tvTitleTwo);
        tvKetTwo = view.findViewById(R.id.tvKetTwo);
    }

    private void setEvent() {


    }
}
