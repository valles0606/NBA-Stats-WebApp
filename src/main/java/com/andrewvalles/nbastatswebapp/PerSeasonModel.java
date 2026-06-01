package com.andrewvalles.nbastatswebapp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PerSeasonModel {
    @JsonProperty("stats")
    private StatsModel stats;
}
