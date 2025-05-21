package com.example.projsync_backend.model;

import jakarta.persistence.*;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String ownerName;
    private String description;
    private String image;

    @Enumerated(EnumType.STRING)
    private Status status;

    public enum Status{
        DOCUMENTATION, DESIGN, API_INTEGRATION, USER_RESEARCH, REQUIREMENTS_GATHERING
    }
}
