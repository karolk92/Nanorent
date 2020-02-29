package com.clurgo.nanorent.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Builder
@NoArgsConstructor
@Data
@Entity
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;

    @OneToMany
    @JsonIgnore
    private List<Reservation> reservations = new ArrayList<>();

    public Resource(String name, Category category) {
        this.name = name;
        this.category = category;
    }
}
