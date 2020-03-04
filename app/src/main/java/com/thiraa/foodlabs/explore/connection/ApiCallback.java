package com.thiraa.foodlabs.explore.connection;


public interface ApiCallback<T> {
    void onSuccess(T response);
    void onError(int statusCode, String message);
}
