package com.thiraa.foodlabs.dapur_location.connection;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.thiraa.foodlabs.MyCustomApplication;
import com.thiraa.foodlabs.dapur_location.model.ResponseDapurLocation;

import java.util.HashMap;
import java.util.Map;

public class ConnectionAPI {
    public static final String URL = "https://private-anon-fa0b8f7862-food28.apiary-mock.com/";

    public static final String dapurUrl = URL + "location";

    private static RequestQueue requestQueue = Volley.newRequestQueue(MyCustomApplication.applicationContext);

    public static void loadDapur(Map<String, String> params, final ApiCallback<ResponseDapurLocation> callback) {
        Map<String, String> headers = new HashMap<>();
//        Map<String, String> params = new HashMap<>();

        GsonRequest<ResponseDapurLocation> gsonRequest = new GsonRequest<>(
                Request.Method.GET,
                dapurUrl,
                ResponseDapurLocation.class,
                headers,
                params,
                new Response.Listener<ResponseDapurLocation>() {
                    @Override
                    public void onResponse(ResponseDapurLocation response) {
                        callback.onSuccess(response);
                    }
                },

                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        callback.onError(400, error.getMessage());
                    }
                }
        );
        gsonRequest.setTag("all");

        requestQueue.add(gsonRequest);
    }

    public void clearConnection() {
        requestQueue.cancelAll("all");
    }
}

