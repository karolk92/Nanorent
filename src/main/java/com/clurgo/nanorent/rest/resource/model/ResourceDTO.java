package com.clurgo.nanorent.rest.resource.model;

import com.clurgo.nanorent.entity.Category;
import com.clurgo.nanorent.entity.Reservation;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class ResourceDTO {

    private Long id;
    private String name;
    private Category category;
    private List<Reservation> reservations;
}
