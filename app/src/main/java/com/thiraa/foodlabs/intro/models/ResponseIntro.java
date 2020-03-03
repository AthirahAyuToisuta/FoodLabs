package com.thiraa.foodlabs.intro.models;

import java.util.List;

public abstract class ResponseIntro {

    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("data")
    private List<DataEntity> data;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("message")
    private String message;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("status")
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
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("intro_desc")
        private String intro_desc;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("intro_title")
        private String intro_title;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("intro_icon")
        private String intro_icon;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("intro_background")
        private String intro_background;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("intro_id")
        private int intro_id;

        public String getIntro_desc() {
            return intro_desc;
        }

        public void setIntro_desc(String intro_desc) {
            this.intro_desc = intro_desc;
        }

        public String getIntro_title() {
            return intro_title;
        }

        public void setIntro_title(String intro_title) {
            this.intro_title = intro_title;
        }

        public String getIntro_icon() {
            return intro_icon;
        }

        public void setIntro_icon(String intro_icon) {
            this.intro_icon = intro_icon;
        }

        public String getIntro_background() {
            return intro_background;
        }

        public void setIntro_background(String intro_background) {
            this.intro_background = intro_background;
        }

        public int getIntro_id() {
            return intro_id;
        }

        public void setIntro_id(int intro_id) {
            this.intro_id = intro_id;
        }
    }
}

