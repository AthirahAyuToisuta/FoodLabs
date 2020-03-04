package com.thiraa.foodlabs.detail.connection;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.thiraa.foodlabs.MyCustomApplication;
import com.thiraa.foodlabs.detail.models.ResponseDetails;
import com.thiraa.foodlabs.explore.model.BannerItem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectionAPI {
    public static final String URL = "https://private-anon-fa0b8f7862-food28.apiary-mock.com/";

    public static final String detailURL = URL+"food/detail";

    private static RequestQueue requestQueue = Volley.newRequestQueue(MyCustomApplication.applicationContext);

    public static void loadDetail(Map<String, String> params, final ApiCallback<ResponseDetails> callback){
        Map<String, String> headers = new HashMap<>();
//        Map<String, String> params = new HashMap<>();

        GsonRequest<ResponseDetails> gsonRequest = new GsonRequest<>(
                Request.Method.GET,
                detailURL,
                ResponseDetails.class,
                headers,
                params,
                new Response.Listener<ResponseDetails>() {
                    @Override
                    public void onResponse(ResponseDetails response) {
                        callback.onSuccess(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        callback.onError(400, error.getMessage() );
                    }
                }
        );
        gsonRequest.setTag("all");

        requestQueue.add(gsonRequest);
    }

    public void clearConnection(){
        requestQueue.cancelAll("all");
    }
}
