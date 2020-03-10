package com.thiraa.foodlabs.home.connection;

public interface ApiCallback<T> {
    void onSuccess(T response);

    void onError(int statusCode, String message);
}
