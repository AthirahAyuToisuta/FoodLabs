package com.thiraa.foodlabs.login_regis.connection_login;


public interface ApiCallback<T> {
    void onSuccess(T response);
    void onError(int statusCode, String message);
}
