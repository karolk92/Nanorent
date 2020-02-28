package com.clurgo.nanorent.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
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
    private Set<Reservation> reservations = new HashSet<>();

    public Resource(String name, Category category) {
        this.name = name;
        this.category = category;
    }
}
