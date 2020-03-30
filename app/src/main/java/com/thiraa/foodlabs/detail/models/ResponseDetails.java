package com.thiraa.foodlabs.detail.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseDetails {

    @SerializedName("data")
    private DataEntity data;
    @SerializedName("message")
    private String message;
    @SerializedName("status")
    private int status;

    public DataEntity getData() {
        return data;
    }

    public void setData(DataEntity data) {
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
        @SerializedName("recipe_cook_step")
        private List<Recipe_cook_stepEntity> recipe_cook_step;
        @SerializedName("recipe_ingridients")
        private List<Recipe_ingridientsEntity> recipe_ingridients;
        @SerializedName("recipe_video_url")
        private String recipe_video_url;
        @SerializedName("recipe_cook_time")
        private String recipe_cook_time;
        @SerializedName("recipe_prep_time")
        private String recipe_prep_time;
        @SerializedName("recipe_servings")
        private String recipe_servings;
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

        public List<Recipe_cook_stepEntity> getRecipe_cook_step() {
            return recipe_cook_step;
        }

        public void setRecipe_cook_step(List<Recipe_cook_stepEntity> recipe_cook_step) {
            this.recipe_cook_step = recipe_cook_step;
        }

        public List<Recipe_ingridientsEntity> getRecipe_ingridients() {
            return recipe_ingridients;
        }

        public void setRecipe_ingridients(List<Recipe_ingridientsEntity> recipe_ingridients) {
            this.recipe_ingridients = recipe_ingridients;
        }

        public String getRecipe_video_url() {
            return recipe_video_url;
        }

        public void setRecipe_video_url(String recipe_video_url) {
            this.recipe_video_url = recipe_video_url;
        }

        public String getRecipe_cook_time() {
            return recipe_cook_time;
        }

        public void setRecipe_cook_time(String recipe_cook_time) {
            this.recipe_cook_time = recipe_cook_time;
        }

        public String getRecipe_prep_time() {
            return recipe_prep_time;
        }

        public void setRecipe_prep_time(String recipe_prep_time) {
            this.recipe_prep_time = recipe_prep_time;
        }

        public String getRecipe_servings() {
            return recipe_servings;
        }

        public void setRecipe_servings(String recipe_servings) {
            this.recipe_servings = recipe_servings;
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

    public static class Recipe_cook_stepEntity {
        @SerializedName("cook_step_desc")
        private String cook_step_desc;
        @SerializedName("cook_step_title")
        private String cook_step_title;
        @SerializedName("cook_step_id")
        private int cook_step_id;

        public String getCook_step_desc() {
            return cook_step_desc;
        }

        public void setCook_step_desc(String cook_step_desc) {
            this.cook_step_desc = cook_step_desc;
        }

        public String getCook_step_title() {
            return cook_step_title;
        }

        public void setCook_step_title(String cook_step_title) {
            this.cook_step_title = cook_step_title;
        }

        public int getCook_step_id() {
            return cook_step_id;
        }

        public void setCook_step_id(int cook_step_id) {
            this.cook_step_id = cook_step_id;
        }
    }

    public static class Recipe_ingridientsEntity {
        @SerializedName("ingridients_desc")
        private String ingridients_desc;
        @SerializedName("ingridients_id")
        private int ingridients_id;

        public String getIngridients_desc() {
            return ingridients_desc;
        }

        public void setIngridients_desc(String ingridients_desc) {
            this.ingridients_desc = ingridients_desc;
        }

        public int getIngridients_id() {
            return ingridients_id;
        }

        public void setIngridients_id(int ingridients_id) {
            this.ingridients_id = ingridients_id;
        }
    }
}