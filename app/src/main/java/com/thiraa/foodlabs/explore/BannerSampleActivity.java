package com.thiraa.foodlabs.explore;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;
import com.thiraa.foodlabs.R;
import com.thiraa.foodlabs.explore.connection.ApiCallback;
import com.thiraa.foodlabs.explore.connection.ConnectionAPI;
import com.thiraa.foodlabs.explore.model.BannerItem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BannerSampleActivity extends AppCompatActivity {
    TextView tvResponse;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_sample);

        tvResponse = findViewById(R.id.tv_response);

        //show dialog
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("loading...");
        progressDialog.show();

        Map<String, String > params = new HashMap<>();

        ConnectionAPI.loadBanner(params, new ApiCallback<List<BannerItem.DataEntity>>() {
            @Override
            public void onSuccess(List<BannerItem.DataEntity> response) {
                progressDialog.dismiss();
                setDataResponse(response);
            }

            @Override
            public void onError(int statusCode, String message) {
                progressDialog.dismiss();
                Log.e("TAG", message);
            }
        });
    }

    private void setDataResponse(List<BannerItem.DataEntity> response) {
        Gson gson = new Gson();
        String responseString = gson.toJson(response);
        tvResponse.setText(responseString);
    }
}
