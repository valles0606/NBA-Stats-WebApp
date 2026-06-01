package com.andrewvalles.nbastatswebapp.service;

import com.andrewvalles.nbastatswebapp.model.ApiResponse;
import com.andrewvalles.nbastatswebapp.model.PlayerStatsModel;
import com.andrewvalles.nbastatswebapp.model.PlayerPreviewModel;
import com.andrewvalles.nbastatswebapp.model.PlayerProfileModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PlayerService {
    private final HttpHeaders headers;
    private final RestTemplate restTemplate;
    private final String offset;
    private final String limit;
    private HttpEntity<String> entity;

    @Value("${highlightly.base.url}")
    private String baseUrl;
    @Value("${highlightly.api.key}")
    private String apiKey;

    public PlayerService() {
        headers = new HttpHeaders();
        restTemplate = new RestTemplate();
        offset = "0";
        limit = "10";
    }

    public List<PlayerPreviewModel> getPlayers(String playerName) {
        headers.set("x-rapidapi-key", apiKey);
        entity = new HttpEntity<>(headers);
        ApiResponse apiResponse = new ApiResponse();

        ResponseEntity<ApiResponse> response = restTemplate.exchange(
                baseUrl + "/players?name=" + playerName + "&limit=" + limit + "&offset=" + offset,
                HttpMethod.GET,
                entity,
                ApiResponse.class);
        apiResponse = response.getBody();
        return apiResponse.getPlayers();
    }


    public PlayerProfileModel getPlayerProfile(String id) {
        headers.set("x-rapidapi-key", apiKey);
        entity = new HttpEntity<>(headers);

        ResponseEntity<List<PlayerProfileModel>> response = restTemplate.exchange(
                baseUrl + "/players/" + id,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<PlayerProfileModel>>() {}
        );
        return response.getBody().get(0);
    }

    public PlayerStatsModel getPlayerStats(String id) {
        headers.set("x-rapidapi-key", apiKey);
        entity = new HttpEntity<>(headers);

        ResponseEntity<List<PlayerStatsModel>> response = restTemplate.exchange(
                baseUrl + "/players/" + id + "/statistics",
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<PlayerStatsModel>>() {}
        );
        return response.getBody().get(0);
    }
}
