package com.andrewvalles.nbastatswebapp;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.PathVariable;

public class PlayerProfileModel extends PlayerPreviewModel{
    @JsonProperty("profile")
    private ProfileModel profile;

    public ProfileModel getProfile() {
        return profile;
    }
}
