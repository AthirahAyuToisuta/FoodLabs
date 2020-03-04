package com.thiraa.foodlabs.detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.thiraa.foodlabs.R;
import com.thiraa.foodlabs.detail.connection.ApiCallback;
import com.thiraa.foodlabs.detail.connection.ConnectionAPI;
import com.thiraa.foodlabs.detail.models.ResponseDetails;

import java.util.HashMap;
import java.util.Map;

public class AuthActivity extends AppCompatActivity {

    TextView tvNama, tvNote, tvDesc, tvServings, tvPrepTime, tvCookTime;
    ImageView ivImage;
    Button btnNext;
    private ResponseDetails.DataEntity responseDetailData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        tvNama = findViewById(R.id.tvNama);
        tvNote = findViewById(R.id.tvNote);
        tvDesc = findViewById(R.id.tvDesc);
        tvServings = findViewById(R.id.tvServings);
        tvPrepTime = findViewById(R.id.tvPrepTime);
        tvCookTime = findViewById(R.id.tvCookTime);
        ivImage = findViewById(R.id.ivImage);
        btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DetailActivity.responseDetailData = responseDetailData;
                Intent intent = new Intent(AuthActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });

        loadDetail();
    }

    private void loadDetail() {
        Map<String, String> params = new HashMap<>();
        ConnectionAPI.loadDetail(params, new ApiCallback<ResponseDetails>() {
            @Override
            public void onSuccess(ResponseDetails response) {
                if (response.getStatus() == 200) {
                    setDataDetail(response.getData());
                }
            }

            @Override
            public void onError(int statusCode, String message) {

            }
        });
    }

    private void setDataDetail(ResponseDetails.DataEntity data) {
        responseDetailData = data;
        tvNama.setText(data.getRecipe_title());
        tvNote.setText(data.getRecipe_sub_title());
        tvDesc.setText(data.getRecipe_desc());
        tvServings.setText(data.getRecipe_servings());
        tvPrepTime.setText(data.getRecipe_prep_time());
        tvCookTime.setText(data.getRecipe_cook_time());
        Picasso.with(this).load(data.getRecipe_image()).into(ivImage);
    }
}
