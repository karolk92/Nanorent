package com.clurgo.nanorent.rest.reservation.model;

import com.clurgo.nanorent.entity.Resource;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ReservationDTO {

    private Long id;
    private String username;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Resource resource;
}
