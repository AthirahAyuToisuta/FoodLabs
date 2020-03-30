package com.thiraa.foodlabs.login_regis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.thiraa.foodlabs.R;
import com.thiraa.foodlabs.home.HomeActivity;
import com.thiraa.foodlabs.login_regis.connection_login.ApiCallback;
import com.thiraa.foodlabs.login_regis.connection_login.ConnectionAPI;
import com.thiraa.foodlabs.login_regis.models.ResponseLogin;

import java.util.HashMap;
import java.util.Map;

import com.thiraa.foodlabs.R;

public class LoginActivity extends AppCompatActivity {

    ImageView ivImage;
    TextView tvBack, tvSignUp, tvLogin;
    TextInputEditText txtEmail, txtPassword;
    Switch switch1;
    private ResponseLogin.DataEntity responseLoginData;
    private Context context;

    public static final String SHARED_PREFS = "simpan";
    public static final String TEXT = "text";
    public static final String SWITCH = "switch1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ivImage = findViewById(R.id.ivImage);
        tvBack = findViewById(R.id.tvBack);
        tvSignUp = findViewById(R.id.tvSignUp);
        tvLogin = findViewById(R.id.tvLogin);
        txtEmail = findViewById(R.id.txtEmail);
        txtPassword = findViewById(R.id.txtPassowrd);
        switch1 = findViewById(R.id.switch1);

        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadLogin();
                if (txtEmail.getText().toString().isEmpty()) {
                    Toast.makeText(LoginActivity.this, "please fill your email", Toast.LENGTH_SHORT).show();
                    return;
                }
                //check valid email
                if (txtEmail.getText().toString().contains("@")){
                    Toast.makeText(LoginActivity.this, "please correct email", Toast.LENGTH_SHORT).show();
                    return;
                }
                //check password
                if (txtPassword.getText().toString().isEmpty()){
                    Toast.makeText(LoginActivity.this, "please fill your password", Toast.LENGTH_SHORT).show();
                    return;
                }
                //check password contains space
                if (txtPassword.getText().toString().contains(" ")){
                    Toast.makeText(LoginActivity.this, "don't use space for password", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
    }

    private void loadLogin() {
        Map<String, String> params = new HashMap<>();
        params.put("member_email", txtEmail.getText().toString());
        params.put("member_password", txtPassword.getText().toString());
        ConnectionAPI.loadLogin(params, new ApiCallback<ResponseLogin>() {
            @Override
            public void onSuccess(ResponseLogin response) {

                SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                responseLoginData = response.getData();
                editor.putString("member_image", responseLoginData.getMember_image());
                editor.putString("member_name", responseLoginData.getMember_name());
                editor.putString("member_email", responseLoginData.getMember_email());
                editor.putString("member_phone", responseLoginData.getMember_phone());
                editor.putString("member_address", responseLoginData.getMember_address());
                editor.putBoolean(SWITCH, switch1.isChecked());
                editor.putBoolean("login", true);
                editor.apply();
            }

            @Override
            public void onError(int statusCode, String message) {

            }
        });
    }
}