package com.andrewvalles.nbastatswebapp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerPreviewModel {
    @JsonProperty("fullName")
    private String playerName;
    @JsonProperty("id")
    private String playerId;

    public String getPlayerName() {
        return playerName;
    }
    public String getPlayerId() {
        return playerId;
    }
}
