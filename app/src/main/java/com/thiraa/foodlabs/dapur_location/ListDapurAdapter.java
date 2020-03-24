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

public class ListDapurAdapter extends RecyclerView.Adapter<ListDapurAdapter.LocationActivityViewHolder> {

    public List<ResponseDapurLocation.DataEntity> items;
    Context context;

    public ListDapurAdapter(List<ResponseDapurLocation.DataEntity> items) {
        this.items = new ArrayList();
        this.items = items;
    }

    @NonNull
    @Override
    public LocationActivityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_listdapur, parent, false);
        return new ListDapurAdapter.LocationActivityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final LocationActivityViewHolder holder, int position) {
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

    public class LocationActivityViewHolder extends RecyclerView.ViewHolder {

        TextView tvKitchenName, tvKitchenOpen, tvKitchenAddress;
        Button btnKitchenRating;
        ImageView ivKitchen, ivMarker;


        public LocationActivityViewHolder(@NonNull View view) {
            super(view);

            setView(view);
            setEvent();
        }

        private void setEvent() {

        }

        private void setView(View view) {

            tvKitchenName = view.findViewById(R.id.tvKicthenName);
            tvKitchenOpen = view.findViewById(R.id.tvKitchenOpen);
            tvKitchenAddress = view.findViewById(R.id.tvKicthenAddress);

            btnKitchenRating = view.findViewById(R.id.btnKitchenRating);

            ivKitchen = view.findViewById(R.id.ivKitchen);
            ivMarker = view.findViewById(R.id.ivMarker);

        }
    }
}



