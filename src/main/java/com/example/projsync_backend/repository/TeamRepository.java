package com.example.projsync_backend.repository;

import com.example.projsync_backend.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository  extends JpaRepository<Team, Long> {
}
