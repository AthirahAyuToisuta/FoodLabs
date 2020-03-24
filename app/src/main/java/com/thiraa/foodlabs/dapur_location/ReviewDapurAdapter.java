package com.thiraa.foodlabs.dapur_location;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.thiraa.foodlabs.R;
import com.thiraa.foodlabs.dapur_location.model.ResponseDapurLocation;

import java.util.ArrayList;
import java.util.List;

public class ReviewDapurAdapter extends RecyclerView.Adapter<ReviewDapurAdapter.ReviewDapurActivityViewHolder> {

    public List<ResponseDapurLocation.DataEntity> items;
    Context context;

    public ReviewDapurAdapter(List<ResponseDapurLocation.DataEntity> items){
        this.items = new ArrayList();
        this.items = items;
    }


    @NonNull
    @Override
    public ReviewDapurActivityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_reviewdapur, parent, false);
        return new ReviewDapurAdapter.ReviewDapurActivityViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ReviewDapurActivityViewHolder holder, int position) {
        holder.tvKitchenName.setText(items.get(position).getKitchen_name());
        holder.tvKitchenOpen.setText(items.get(position).getKitchen_open());
        holder.tvKitchenAddress.setText(items.get(position).getKitchen_address());


        holder.btnKitchenRating.setText(String.valueOf(items.get(position).getKitchen_rating()));

        Picasso.with(context).load(items.get(position).getKitchen_image()).centerCrop().fit().into(holder.ivKitchen);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ReviewDapurActivityViewHolder extends RecyclerView.ViewHolder {

        TextView tvKitchenName, tvKitchenOpen, tvKitchenAddress;
        Button btnKitchenRating;
        ImageView ivKitchen;

        public ReviewDapurActivityViewHolder(View view) {
            super(view);

            setView(view);
        }

        private void setView(View view) {

            tvKitchenName = view.findViewById(R.id.tvKicthenName);
            tvKitchenOpen = view.findViewById(R.id.tvKitchenOpen);
            tvKitchenAddress = view.findViewById(R.id.tvKicthenAddress);

            btnKitchenRating = view.findViewById(R.id.btnKitchenRating);

            ivKitchen = view.findViewById(R.id.ivKitchen);
        }
    }
}
