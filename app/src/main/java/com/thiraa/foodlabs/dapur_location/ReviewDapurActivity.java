package com.thiraa.foodlabs.dapur_location;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.thiraa.foodlabs.R;
import com.thiraa.foodlabs.dapur_location.connection.ApiCallback;
import com.thiraa.foodlabs.dapur_location.connection.ConnectionAPI;
import com.thiraa.foodlabs.dapur_location.model.FragmentBottomSheetLocation;
import com.thiraa.foodlabs.dapur_location.model.FragmentListDapur;
import com.thiraa.foodlabs.dapur_location.model.FragmentLocation;
import com.thiraa.foodlabs.dapur_location.model.ResponseDapurLocation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReviewDapurActivity extends AppCompatActivity implements OnMapReadyCallback {

    ImageView ivBack;
    TextView tvReviewDapur;
    EditText etSearch;

    FragmentBottomSheetLocation bottomSheetLocation = new FragmentBottomSheetLocation();

    GoogleMap gMap;
    MapView gMapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_dapur);

        setView();
        setEvent();

    }

    private void setFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }

    private void setEvent() {
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFragment(new FragmentListDapur());
            }
        });

    }

    private void setView() {
        ivBack = findViewById(R.id.ivBack);
        tvReviewDapur = findViewById(R.id.tvReviewDapur);
        etSearch = findViewById(R.id.etSearch);

        gMapView = findViewById(R.id.google_maps);
        if (gMapView != null){
            gMapView.onCreate(null);
            gMapView.onResume();
            gMapView.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        MapsInitializer.initialize(getApplicationContext());
        gMap = googleMap;
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        googleMap.addMarker(new MarkerOptions().position(new LatLng(-6.2721937, 106.7367283)));

        googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng latLng) {
                bottomSheetLocation.show(getSupportFragmentManager(), "location");
            }
        });

        CameraPosition KitchenMama = CameraPosition.builder()
                .target(new LatLng(-6.2721937, 106.7367283)).zoom(15)
                .bearing(0).tilt(45).build();

        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(KitchenMama));
    }
}


