package com.clurgo.nanorent.com.clurgo.nanorent.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @ManyToOne
    private Resource resource;

    @ManyToOne
    private User user;


}
