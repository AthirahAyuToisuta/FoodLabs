package com.thiraa.foodlabs.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.thiraa.foodlabs.R;

public class HomeActivity extends AppCompatActivity {

    RecyclerView rvMostPopular, rvMealDeals;
    EditText etSearch;
    TextView tvMostPopular, tvMealDeals, tvSeeAllmp, tvSeeAllmd;
    String search = "";

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        context = getApplicationContext();

        setView();
        setEvent();
        setRecyclerView();
    }

    private void setView() {
        rvMostPopular = findViewById(R.id.rvMostPopular);
        rvMealDeals = findViewById(R.id.rvMealDeals);
        etSearch = findViewById(R.id.etSearch);
        tvMostPopular = findViewById(R.id.tvMostPopular);
        tvMealDeals = findViewById(R.id.tvMealDeals);
        tvSeeAllmp = findViewById(R.id.tvSeeAllmp);
        tvSeeAllmd = findViewById(R.id.tvSeaAllmd);

    }

    private void setEvent() {
        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                search = s.toString();
            }
        });

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

    private void setRecyclerView() {
        rvMostPopular.setHasFixedSize(true);
        rvMostPopular.setLayoutManager(new GridLayoutManager(context,1));

    }
}
