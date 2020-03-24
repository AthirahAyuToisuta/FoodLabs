package com.thiraa.foodlabs.dapur_location.connection;

public interface ApiCallback<T> {
    void onSuccess(T response);

    void onError(int statusCode, String message);
}
