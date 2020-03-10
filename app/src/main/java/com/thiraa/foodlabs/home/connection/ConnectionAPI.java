package com.thiraa.foodlabs.home.connection;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.thiraa.foodlabs.MyCustomApplication;
import com.thiraa.foodlabs.home.model.ResponseHome;

import java.util.HashMap;
import java.util.Map;

public class ConnectionAPI {
    public static final String URL = "https://private-anon-fa0b8f7862-food28.apiary-mock.com/";

    public static final String homeUrl = URL + "food/popular";

    private static RequestQueue requestQueue = Volley.newRequestQueue(MyCustomApplication.applicationContext);

    public static void loadHome(Map<String, String> params, final ApiCallback<ResponseHome> callback) {
        Map<String, String> headers = new HashMap<>();
//        Map<String, String> params = new HashMap<>();

        GsonRequest<ResponseHome> gsonRequest = new GsonRequest<>(
                Request.Method.GET,
                homeUrl,
                ResponseHome.class,
                headers,
                params,
                new Response.Listener<ResponseHome>() {
                    @Override
                    public void onResponse(ResponseHome response) {
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

