package com.example.projsync_backend.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    private List<Member> members;
}
