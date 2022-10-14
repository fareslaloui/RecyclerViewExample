package com.knightcoder.myapplication;

public class Data {
    private String categoryName;
    private String proteins;
    private String calories;

    public Data(String categoryName, String protiens, String calories) {
        this.categoryName = categoryName;
        this.proteins = protiens;
        this.calories = calories;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getProteins() {
        return proteins;
    }

    public void setProteins(String proteins) {
        this.proteins = proteins;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }
}
