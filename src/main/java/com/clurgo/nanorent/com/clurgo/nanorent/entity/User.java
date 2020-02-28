package com.clurgo.nanorent.com.clurgo.nanorent.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String login;

    @OneToMany
    @JsonIgnore
    private Set<Reservation> reservations = new HashSet<>();

}
