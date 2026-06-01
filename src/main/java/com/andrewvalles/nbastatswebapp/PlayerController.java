package com.andrewvalles.nbastatswebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {
    private final PlayerService playerService;
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/players")
    public List<PlayerPreviewModel> getPlayerList(@RequestParam String name) {
        return playerService.getPlayers(name);
    }

    @GetMapping("/players/{id}")
    public PlayerProfileModel getPlayer(@PathVariable String id) {
        return playerService.getPlayerProfile(id);
    }

    @GetMapping("/players/{id}/statistics")
    public PlayerStatsModel getPlayerStats(@PathVariable String id) {
        return playerService.getPlayerStats(id);
    }

}
