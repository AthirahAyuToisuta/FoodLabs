package com.thiraa.foodlabs.home;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import android.view.View;

import android.widget.ImageView;

import com.thiraa.foodlabs.R;
import com.thiraa.foodlabs.dapur_location.model.FragmentLocation;
import com.thiraa.foodlabs.home.model.FragmentHome;

public class HomeActivity extends AppCompatActivity {

    ImageView ivHome, ivLocation, ivLove, ivUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setView();
        setEvent();
        setFragment(new FragmentHome());
    }

    private void setFragment(Fragment fragment) {

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.commit();
    }

    private void setEvent() {
        ivHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(new FragmentHome());

//                ivHome.setImageDrawable(getResources().getDrawable(R.drawable.ic_home_klik));
//                ivLocation.setImageDrawable(getResources().getDrawable(R.drawable.ic_location));
//                ivLove.setImageDrawable(getResources().getDrawable(R.drawable.ic_love));
//                ivUser.setImageDrawable(getResources().getDrawable(R.drawable.ic_user));
            }
        });

        ivLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                setFragment(new FragmentLocation());
//                ivHome.setImageDrawable(getResources().getDrawable(R.drawable.ic_home));
//                ivLocation.setImageDrawable(getResources().getDrawable(R.drawable.ic_location_klik));
//                ivLove.setImageDrawable(getResources().getDrawable(R.drawable.ic_love));
//                ivUser.setImageDrawable(getResources().getDrawable(R.drawable.ic_user));

            }
        });

        ivLove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                ivHome.setImageDrawable(getResources().getDrawable(R.drawable.ic_home));
//                ivLocation.setImageDrawable(getResources().getDrawable(R.drawable.ic_location));
//                ivLove.setImageDrawable(getResources().getDrawable(R.drawable.ic_love_klik));
//                ivUser.setImageDrawable(getResources().getDrawable(R.drawable.ic_user));

            }
        });

        ivUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                ivHome.setImageDrawable(getResources().getDrawable(R.drawable.ic_home));
//                ivLocation.setImageDrawable(getResources().getDrawable(R.drawable.ic_location));
//                ivLove.setImageDrawable(getResources().getDrawable(R.drawable.ic_love));
//                ivUser.setImageDrawable(getResources().getDrawable(R.drawable.ic_user_klik));
            }
        });
    }

    private void setView() {
        ivHome = findViewById(R.id.ivHome);
        ivLocation = findViewById(R.id.ivLocation);
        ivLove = findViewById(R.id.ivLove);
        ivUser = findViewById(R.id.ivUser);
    }


}

