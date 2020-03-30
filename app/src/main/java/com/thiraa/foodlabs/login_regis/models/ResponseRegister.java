package com.thiraa.foodlabs.login_regis.models;

import com.google.gson.annotations.SerializedName;

public class ResponseRegister {
    @SerializedName("message")
    private String message;
    @SerializedName("status")
    private int status;

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }
}
