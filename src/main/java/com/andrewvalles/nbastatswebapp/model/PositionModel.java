package com.andrewvalles.nbastatswebapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PositionModel {
    @JsonProperty("main")
    private String main;

    @JsonProperty("abbreviation")
    private String abbreviation;
}
