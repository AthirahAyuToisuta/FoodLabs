package com.thiraa.foodlabs.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thiraa.foodlabs.R;
import com.thiraa.foodlabs.home.model.ResponseHome;

import java.util.ArrayList;
import java.util.List;

public class HomeActivityAdapter extends RecyclerView.Adapter<HomeActivityAdapter.HomeActivityViewHolder> {

    public List<ResponseHome> items;
    Context context;

    public HomeActivityAdapter() {
        items = new ArrayList();
    }

    @NonNull
    @Override
    public HomeActivityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_food, parent, false);
        return new HomeActivityAdapter.HomeActivityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeActivityViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class HomeActivityViewHolder extends RecyclerView.ViewHolder {
        TextView tvMostPopular, tvMealDeals, tvSeeAllmp, tvSeeAllmd;
        RecyclerView rvMostPopular, rvMealDeals;


        public HomeActivityViewHolder(@NonNull View view) {
            super(view);

            setView(view);
        }

        private void setView(View view) {

            tvMostPopular = view.findViewById(R.id.tvMostPopular);
            tvMealDeals = view.findViewById(R.id.tvMealDeals);
            tvSeeAllmp = view.findViewById(R.id.tvSeeAllmp);
            tvSeeAllmd = view.findViewById(R.id.tvSeaAllmd);

            rvMostPopular = view.findViewById(R.id.rvMostPopular);
            rvMealDeals = view.findViewById(R.id.rvMealDeals);
        }
    }
}
