package com.thiraa.foodlabs.intro.connection;


public interface ApiCallback<T> {
    void onSuccess(T response);
    void onError(int statusCode, String message);
}
