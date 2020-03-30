package com.thiraa.foodlabs.login_regis.connection_regis;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.thiraa.foodlabs.MyCustomApplication;
import com.thiraa.foodlabs.login_regis.models.ResponseLogin;
import com.thiraa.foodlabs.login_regis.models.ResponseRegister;

import java.util.HashMap;
import java.util.Map;

public class ConnectionAPI {
    public static final String URL = "https://private-anon-edf414ece1-food28.apiary-mock.com/";

    public static final String registerURL = URL+"register";

    private static RequestQueue requestQueue = Volley.newRequestQueue
                                                (MyCustomApplication.applicationContext);

    public static void loadRegister(Map<String, String> params,
                                                    final ApiCallback<ResponseRegister> callback){
        Map<String, String> headers = new HashMap<>();
//        Map<String, String> params = new HashMap<>();

        GsonRequest<ResponseRegister> gsonRequest = new GsonRequest<>(
                Request.Method.POST,
                registerURL,
                ResponseRegister.class,
                headers,
                params,
                new Response.Listener<ResponseRegister>() {
                    @Override
                    public void onResponse(ResponseRegister response) {
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
