package com.andrewvalles.nbastatswebapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TeamModel {
    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("league")
    private String league;

    @JsonProperty("displayName")
    private String displayName;

    @JsonProperty("abbreviation")
    private String abbreviation;
}
