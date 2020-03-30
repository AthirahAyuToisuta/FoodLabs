package com.thiraa.foodlabs.login_regis.connection_login;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.thiraa.foodlabs.MyCustomApplication;
import com.thiraa.foodlabs.login_regis.models.ResponseLogin;

import java.util.HashMap;
import java.util.Map;

public class ConnectionAPI {
    public static final String URL = "https://private-anon-edf414ece1-food28.apiary-mock.com/";

    public static final String loginURL = URL+"login";

    private static RequestQueue requestQueue = Volley.newRequestQueue
                                                (MyCustomApplication.applicationContext);

    public static void loadLogin(Map<String, String> params,
                                                    final ApiCallback<ResponseLogin> callback){
        Map<String, String> headers = new HashMap<>();
//        Map<String, String> params = new HashMap<>();

        GsonRequest<ResponseLogin> gsonRequest = new GsonRequest<>(
                Request.Method.POST,
                loginURL,
                ResponseLogin.class,
                headers,
                params,
                new Response.Listener<ResponseLogin>() {
                    @Override
                    public void onResponse(ResponseLogin response) {
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
