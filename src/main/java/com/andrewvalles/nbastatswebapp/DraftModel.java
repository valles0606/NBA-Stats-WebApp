package com.andrewvalles.nbastatswebapp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DraftModel {
    @JsonProperty("pick")
    private String pick;

    @JsonProperty("year")
    private String year;

    @JsonProperty("round")
    private String round;
}
