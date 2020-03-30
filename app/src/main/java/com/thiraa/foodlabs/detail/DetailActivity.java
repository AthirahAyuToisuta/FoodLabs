package com.thiraa.foodlabs.detail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.thiraa.foodlabs.R;
import com.thiraa.foodlabs.detail.connection.ApiCallback;
import com.thiraa.foodlabs.detail.connection.ConnectionAPI;
import com.thiraa.foodlabs.detail.fragment.FragmentDirections;
import com.thiraa.foodlabs.detail.fragment.FragmentIngredients;
import com.thiraa.foodlabs.detail.models.ResponseDetails;

import java.util.HashMap;
import java.util.Map;

public class DetailActivity extends AppCompatActivity {

    public static ResponseDetails.DataEntity responseDetailData;
    TextView tvIngredients, tvDirections;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setView();
        setEvent();

        FragmentIngredients fragment = new FragmentIngredients();
        fragment.responseDetailData = responseDetailData;
        setFragment(fragment);
    }

    private void setView() {
        tvIngredients = findViewById(R.id.tvIngredients);
        tvDirections = findViewById(R.id.tvDirections);
    }

    private void setEvent() {
        tvIngredients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentIngredients fragment = new FragmentIngredients();
                fragment.responseDetailData = responseDetailData;
                setFragment(fragment);
            }
        });

        tvDirections.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentDirections fragment = new FragmentDirections();
                fragment.responseDetailData = responseDetailData;
                setFragment(fragment);
            }
        });
    }

    private void setFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }
}
