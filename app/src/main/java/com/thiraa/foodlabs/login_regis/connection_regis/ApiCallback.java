package com.thiraa.foodlabs.login_regis.connection_regis;


public interface ApiCallback<T> {
    void onSuccess(T response);
    void onError(int statusCode, String message);
}
