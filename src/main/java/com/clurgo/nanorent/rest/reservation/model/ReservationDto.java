package com.clurgo.nanorent.rest.reservation.model;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class ReservationDto {

    private Long reservationId;
    private Long recourseId;
    private Instant startReservation;
    private Instant endReservation;
    private String nameAndSurname;
}
