package com.andrewvalles.nbastatswebapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ApiResponse {
    @JsonProperty("data")
    private List<PlayerPreviewModel> playerList;

    public List<PlayerPreviewModel> getPlayers() {
        return playerList;
    }
}
