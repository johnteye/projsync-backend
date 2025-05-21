package com.example.projsync_backend.controller;

import com.example.projsync_backend.model.Team;
import com.example.projsync_backend.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {
    @Autowired private TeamService teamService;

    @GetMapping
    public List<Team> getTeams(){

        return teamService.getAllTeams();
    }

    public Team addTeam(@RequestBody Team team){
        return teamService.addTeam((team));
    }
}
