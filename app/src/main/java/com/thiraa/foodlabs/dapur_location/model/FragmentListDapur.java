package com.thiraa.foodlabs.dapur_location.model;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.thiraa.foodlabs.R;
import com.thiraa.foodlabs.dapur_location.ListDapurAdapter;
import com.thiraa.foodlabs.dapur_location.ReviewDapurActivity;
import com.thiraa.foodlabs.home.connection.ApiCallback;
import com.thiraa.foodlabs.home.connection.ConnectionAPI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FragmentListDapur extends Fragment {

    RecyclerView rvListDapur;
    ImageView ivBack, ivMap;
    Context context;

    public FragmentListDapur() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment_list_dapur, container,
                false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        context = getContext();

        setView(view);
        setEvent();
        loadListDapur();

    }

    private void setView(View view) {

        ivBack = view.findViewById(R.id.ivBack);
        ivMap = view.findViewById(R.id.ivMap);
        rvListDapur = view.findViewById(R.id.rvListdapur);

    }

    private void setEvent() {

        ivMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ReviewDapurActivity.class);
                getActivity().startActivity(intent);
            }
        });

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new FragmentLocation());
                fr.commit();
            }
        });

        return;
    }

    private void setRecyclerViewListDapur(List<ResponseDapurLocation.DataEntity> data) {
        ListDapurAdapter adapterDapur = new ListDapurAdapter(data);
        rvListDapur.setAdapter(adapterDapur);
    }

    private void loadListDapur() {

        Map<String, String> params = new HashMap<>();
        com.thiraa.foodlabs.dapur_location.connection.ConnectionAPI.loadDapur(params,
                new com.thiraa.foodlabs.dapur_location.connection.
                        ApiCallback<ResponseDapurLocation>() {
                    @Override
                    public void onSuccess(ResponseDapurLocation response) {
                        setRecyclerViewListDapur(response.getData());
                    }

                    @Override
                    public void onError(int statusCode, java.lang.String message) {

                    }
                });
    }

}


