package com.clurgo.nanorent.rest.reservation.model;

import com.clurgo.nanorent.entity.Resource;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ReservationDTO {

    private Long id;
    private String username;
    private LocalDate startDate;
    private LocalDate endDate;
    private Resource resource;
}
