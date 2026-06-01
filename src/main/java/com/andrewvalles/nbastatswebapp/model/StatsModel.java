package com.andrewvalles.nbastatswebapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StatsModel {
    @JsonProperty("name")
    private String name;

    @JsonProperty("value")
    private double value;

    @JsonProperty("category")
    private String category;

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public String getCategory() {
        return category;
    }
}
