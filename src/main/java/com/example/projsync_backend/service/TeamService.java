package com.example.projsync_backend.service;

import com.example.projsync_backend.model.Team;
import com.example.projsync_backend.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    @Autowired private TeamRepository teamRepo;


    public List<Team> getAllTeams(){
        return teamRepo.findAll();
    }
    public Team addTeam(Team team){
        return teamRepo.save(team);
    }
}
