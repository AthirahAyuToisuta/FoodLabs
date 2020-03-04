package com.thiraa.foodlabs.detail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.thiraa.foodlabs.R;
import com.thiraa.foodlabs.detail.fragment.FragmentDirections;
import com.thiraa.foodlabs.detail.fragment.FragmentIngredients;

public class DetailActivity extends AppCompatActivity {

    TextView tvIngredients, tvDirections;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setView();

        setEvent();

        setFragment(new FragmentIngredients());
    }

    private void setView() {
        tvIngredients = findViewById(R.id.tvIngredients);
        tvDirections = findViewById(R.id.tvDirections);
    }

    private void setEvent() {
        tvIngredients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new FragmentIngredients());
            }
        });

        tvDirections.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new FragmentDirections());
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
