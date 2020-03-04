package com.thiraa.foodlabs.explore.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BannerItem {

    @SerializedName("data")
    private List<DataEntity> data;
    @SerializedName("message")
    private String message;
    @SerializedName("status")
    private int status;

    public List<DataEntity> getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    public class DataEntity {
        @SerializedName("banner_desc")
        private String banner_desc;
        @SerializedName("banner_title")
        private String banner_title;
        @SerializedName("banner_image")
        private String banner_image;
        @SerializedName("banner_id")
        private int banner_id;

        public String getBanner_desc() {
            return banner_desc;
        }

        public String getBanner_title() {
            return banner_title;
        }

        public String getBanner_image() {
            return banner_image;
        }

        public int getBanner_id() {
            return banner_id;
        }
    }
}
