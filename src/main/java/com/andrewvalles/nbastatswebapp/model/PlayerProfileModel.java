package com.andrewvalles.nbastatswebapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerProfileModel extends PlayerPreviewModel {
    @JsonProperty("profile")
    private ProfileModel profile;
//temp
    public ProfileModel getProfile() {
        return profile;
    }
}
