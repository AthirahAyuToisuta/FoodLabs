package com.thiraa.foodlabs.home.model;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.thiraa.foodlabs.R;
import com.thiraa.foodlabs.home.FoodAdapter;
import com.thiraa.foodlabs.home.MealAdapter;
import com.thiraa.foodlabs.home.connection.ApiCallback;
import com.thiraa.foodlabs.home.connection.ConnectionAPI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FragmentHome extends Fragment {

    RecyclerView rvMostPopular, rvMealDeals;
    EditText etSearch;
    TextView tvMostPopular, tvMealDeals, tvSeeAllmp, tvSeeAllmd;
//    String search = "";

    Context context;

    public FragmentHome() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        context = getContext();

        setView(view);
        setEvent();
        loadFood();
        loadMeal();
    }

    private void setView(View view) {
        rvMostPopular = view.findViewById(R.id.rvMostPopular);
        rvMealDeals = view.findViewById(R.id.rvMealDeals);
        etSearch = view.findViewById(R.id.etSearch);
        tvMostPopular = view.findViewById(R.id.tvMostPopular);
        tvMealDeals = view.findViewById(R.id.tvMealDeals);
        tvSeeAllmp = view.findViewById(R.id.tvSeeAllmp);
        tvSeeAllmd = view.findViewById(R.id.tvSeaAllmd);
    }

    private void setEvent() {
//        etSearch.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                search = s.toString();
//            }
//        });

        tvSeeAllmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        tvSeeAllmd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void setRecyclerViewFood(List<ResponseHome.DataEntity> data) {
        FoodAdapter adapterFood = new FoodAdapter(data);
        rvMostPopular.setAdapter(adapterFood);
    }

    private void setRecyclerViewMeal(List<ResponseHome.DataEntity> data) {
        MealAdapter adapterMeal = new MealAdapter(data);
        rvMealDeals.setAdapter(adapterMeal);
    }

    private void loadFood() {

        Map<String, String> params = new HashMap<>();
        ConnectionAPI.loadHome(params, new ApiCallback<ResponseHome>() {
            @Override
            public void onSuccess(ResponseHome response) {
                setRecyclerViewFood(response.getData());
            }

            @Override
            public void onError(int statusCode, String message) {

            }
        });
    }

    private void loadMeal() {

        Map<String, String> params = new HashMap<>();
        ConnectionAPI.loadHome(params, new ApiCallback<ResponseHome>() {
            @Override
            public void onSuccess(ResponseHome response) {
                setRecyclerViewMeal(response.getData());
            }

            @Override
            public void onError(int statusCode, String message) {

            }
        });
    }
}


