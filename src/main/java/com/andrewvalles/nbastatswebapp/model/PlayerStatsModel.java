package com.andrewvalles.nbastatswebapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PlayerStatsModel {
    @JsonProperty("perSeason")
    private List<PerSeasonModel> perSeason;

    public List<PerSeasonModel> getPerSeason() {
        return perSeason;
    }
}
