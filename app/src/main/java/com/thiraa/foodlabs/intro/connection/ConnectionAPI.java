package com.thiraa.foodlabs.intro.connection;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.thiraa.foodlabs.MyCustomApplication;
import com.thiraa.foodlabs.explore.model.BannerItem;
import com.thiraa.foodlabs.intro.models.ResponseIntro;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectionAPI {
    public static final String URL = "https://private-anon-fa0b8f7862-food28.apiary-mock.com/";

    public static final String introURL = URL+"intro";

    private static RequestQueue requestQueue = Volley.newRequestQueue(MyCustomApplication.applicationContext);

    public static void loadBanner(Map<String, String> params, final ApiCallback<ResponseIntro> callback){
        Map<String, String> headers = new HashMap<>();
//        Map<String, String> params = new HashMap<>();

        GsonRequest<ResponseIntro> gsonRequest = new GsonRequest<>(
                Request.Method.GET,
                introURL,
                ResponseIntro.class,
                headers,
                params,
                new Response.Listener<ResponseIntro>() {
                    @Override
                    public void onResponse(ResponseIntro response) {
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
