package com.clurgo.nanorent.rest.reservation.model;

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
    private Long resourceId;

    public ReservationDTO(Long id, String username, LocalDate startDate, LocalDate endDate, Long resourceId) {
        this.id = id;
        this.username = username;
        this.startDate = startDate;
        this.endDate = endDate;
        this.resourceId = resourceId;
    }
}
