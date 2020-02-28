package com.clurgo.nanorent.rest.reservation.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ReservationDTO {

    private Long reservationId;
    private Long recourseId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String nameAndSurname;
}
