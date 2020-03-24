package com.thiraa.foodlabs.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.thiraa.foodlabs.R;
import com.thiraa.foodlabs.home.model.ResponseHome;

import java.util.ArrayList;
import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.HomeActivityViewHolder> {

    public List<ResponseHome.DataEntity> items;
    Context context;

    public FoodAdapter(List<ResponseHome.DataEntity> items) {
        this.items = new ArrayList();
        this.items = items;
    }

    @NonNull
    @Override
    public HomeActivityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_food, parent, false);
        return new FoodAdapter.HomeActivityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeActivityViewHolder holder, int position) {
        holder.txtName.setText(items.get(position).getRecipe_title());
        holder.txtAddress.setText(items.get(position).getRecipe_sub_title());
        holder.txtDetail.setText(items.get(position).getRecipe_desc());

        Picasso.with(context).load(items.get(position).getRecipe_image()).centerCrop().fit().into(holder.ivFood);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class HomeActivityViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtAddress, txtDetail;
        ImageView ivFood;


        public HomeActivityViewHolder(@NonNull View view) {
            super(view);

            setView(view);
        }

        private void setView(View view) {

            txtName = view.findViewById(R.id.txtName);
            txtAddress = view.findViewById(R.id.txtAddress);
            txtDetail = view.findViewById(R.id.txtDetail);
            ivFood = view.findViewById(R.id.ivFood);

        }
    }
}
