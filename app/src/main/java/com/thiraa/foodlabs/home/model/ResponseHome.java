package com.thiraa.foodlabs.home.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseHome {
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
        @SerializedName("recipe_total_cook_time")
        private String recipe_total_cook_time;
        @SerializedName("recipe_desc")
        private String recipe_desc;
        @SerializedName("recipe_sub_title")
        private String recipe_sub_title;
        @SerializedName("recipe_title")
        private String recipe_title;
        @SerializedName("recipe_image")
        private String recipe_image;
        @SerializedName("recipe_id")
        private int recipe_id;

        public String getRecipe_total_cook_time() {
            return recipe_total_cook_time;
        }

        public void setRecipe_total_cook_time(String recipe_total_cook_time) {
            this.recipe_total_cook_time = recipe_total_cook_time;
        }

        public String getRecipe_desc() {
            return recipe_desc;
        }

        public void setRecipe_desc(String recipe_desc) {
            this.recipe_desc = recipe_desc;
        }

        public String getRecipe_sub_title() {
            return recipe_sub_title;
        }

        public void setRecipe_sub_title(String recipe_sub_title) {
            this.recipe_sub_title = recipe_sub_title;
        }

        public String getRecipe_title() {
            return recipe_title;
        }

        public void setRecipe_title(String recipe_title) {
            this.recipe_title = recipe_title;
        }

        public String getRecipe_image() {
            return recipe_image;
        }

        public void setRecipe_image(String recipe_image) {
            this.recipe_image = recipe_image;
        }

        public int getRecipe_id() {
            return recipe_id;
        }

        public void setRecipe_id(int recipe_id) {
            this.recipe_id = recipe_id;
        }
    }
}
