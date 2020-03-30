package com.thiraa.foodlabs.login_regis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.thiraa.foodlabs.R;
import com.thiraa.foodlabs.login_regis.connection_regis.ApiCallback;
import com.thiraa.foodlabs.login_regis.connection_regis.ConnectionAPI;
import com.thiraa.foodlabs.login_regis.models.ResponseRegister;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {
    ImageView ivImage;
    TextView tvBack, tvLogIn, tvCreate;
    TextInputEditText txtEmail, txtPassword;
    private Object responseRegisterData;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ivImage = findViewById(R.id.ivImage);
        tvBack = findViewById(R.id.tvBack);
        tvLogIn = findViewById(R.id.tvLogIn);
        tvCreate = findViewById(R.id.tvCreate);
        txtEmail = findViewById(R.id.txtEmail);
        txtPassword = findViewById(R.id.txtPassowrd);

        tvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        tvLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
        tvCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadRegister();
                //check email
                if (txtEmail.getText().toString().isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "please fill your email", Toast.LENGTH_SHORT).show();
                    return;
                }
                //check valid email
                if (txtEmail.getText().toString().contains("@")) {
                    Toast.makeText(RegisterActivity.this, "please correct email", Toast.LENGTH_SHORT).show();
                    return;
                }
                //check password
                if (txtPassword.getText().toString().isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "please fill your password", Toast.LENGTH_SHORT).show();
                    return;
                }
                //check password contains space
                if (txtPassword.getText().toString().contains(" ")) {
                    Toast.makeText(RegisterActivity.this, "don't use space for password", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
    }

    private void loadRegister() {
        Map<String, String> params = new HashMap<>();
        params.put("member_email", txtEmail.getText().toString());
        params.put("member_password", txtPassword.getText().toString());
        ConnectionAPI.loadRegister(params, new ApiCallback<ResponseRegister>() {
            @Override
            public void onSuccess(ResponseRegister response) {

            }

            @Override
            public void onError(int statusCode, String message) {

            }
        });
    }
}
