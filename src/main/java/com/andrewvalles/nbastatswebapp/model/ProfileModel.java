package com.andrewvalles.nbastatswebapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProfileModel {
    @JsonProperty("team")
    private TeamModel team;

    @JsonProperty("draft")
    private DraftModel draft;

    @JsonProperty("height")
    private String height;

    @JsonProperty("jersey")
    private String jersey;

    @JsonProperty("weight")
    private String weight;

    @JsonProperty("isActive")
    private boolean isActive;

    @JsonProperty("position")
    private PositionModel position;

    @JsonProperty("birthDate")
    private String birthDate;

    @JsonProperty("birthPlace")
    private String birthPlace;
}
