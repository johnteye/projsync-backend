package com.example.projsync_backend.model;

import jakarta.persistence.*;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Stack stack;

    private String role;
    private String email;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;


    public enum Stack{
        UI, FRONTEND, BACKEND
    }

}
