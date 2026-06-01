package com.andrewvalles.nbastatswebapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PerSeasonModel {
    @JsonProperty("stats")
    private List<StatsModel> stats;

    public List<StatsModel> getStats() {
        return stats;
    }
}
