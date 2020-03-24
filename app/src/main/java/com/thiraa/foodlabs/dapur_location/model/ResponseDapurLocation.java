package com.thiraa.foodlabs.dapur_location.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseDapurLocation {

    @SerializedName("data")
    private List<DataEntity> data;
    @SerializedName("message")
    private String message;
    @SerializedName("status")
    private int status;

    public List<DataEntity> getData() {
        return data;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class DataEntity {
        @SerializedName("kitchen_longitude")
        private double kitchen_longitude;
        @SerializedName("kitchen_latitude")
        private double kitchen_latitude;
        @SerializedName("kitchen_address")
        private String kitchen_address;
        @SerializedName("kitchen_rating")
        private double kitchen_rating;
        @SerializedName("kitchen_open")
        private String kitchen_open;
        @SerializedName("kitchen_name")
        private String kitchen_name;
        @SerializedName("kitchen_image")
        private String kitchen_image;
        @SerializedName("kitchen_id")
        private int kitchen_id;

        public double getKitchen_longitude() {
            return kitchen_longitude;
        }

        public void setKitchen_longitude(double kitchen_longitude) {
            this.kitchen_longitude = kitchen_longitude;
        }

        public double getKitchen_latitude() {
            return kitchen_latitude;
        }

        public void setKitchen_latitude(double kitchen_latitude) {
            this.kitchen_latitude = kitchen_latitude;
        }

        public String getKitchen_address() {
            return kitchen_address;
        }

        public void setKitchen_address(String kitchen_address) {
            this.kitchen_address = kitchen_address;
        }

        public double getKitchen_rating() {
            return kitchen_rating;
        }

        public void setKitchen_rating(double kitchen_rating) {
            this.kitchen_rating = kitchen_rating;
        }

        public String getKitchen_open() {
            return kitchen_open;
        }

        public void setKitchen_open(String kitchen_open) {
            this.kitchen_open = kitchen_open;
        }

        public String getKitchen_name() {
            return kitchen_name;
        }

        public void setKitchen_name(String kitchen_name) {
            this.kitchen_name = kitchen_name;
        }

        public String getKitchen_image() {
            return kitchen_image;
        }

        public void setKitchen_image(String kitchen_image) {
            this.kitchen_image = kitchen_image;
        }

        public int getKitchen_id() {
            return kitchen_id;
        }

        public void setKitchen_id(int kitchen_id) {
            this.kitchen_id = kitchen_id;
        }
    }
}


