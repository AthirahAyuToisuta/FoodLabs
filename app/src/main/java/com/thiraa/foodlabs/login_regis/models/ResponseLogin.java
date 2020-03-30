package com.thiraa.foodlabs.login_regis.models;

import com.google.gson.annotations.SerializedName;

public class ResponseLogin {
    @SerializedName("data")
    private DataEntity data;
    @SerializedName("message")
    private String message;
    @SerializedName("status")
    private int status;

    public DataEntity getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    public static class DataEntity {
        @SerializedName("member_address")
        private String member_address;
        @SerializedName("member_phone")
        private String member_phone;
        @SerializedName("member_email")
        private String member_email;
        @SerializedName("member_name")
        private String member_name;
        @SerializedName("member_image")
        private String member_image;
        @SerializedName("member_id")
        private int member_id;

        public String getMember_address() {
            return member_address;
        }

        public String getMember_phone() {
            return member_phone;
        }

        public String getMember_email() {
            return member_email;
        }

        public String getMember_name() {
            return member_name;
        }

        public String getMember_image() {
            return member_image;
        }

        public int getMember_id() {
            return member_id;
        }
    }
}
