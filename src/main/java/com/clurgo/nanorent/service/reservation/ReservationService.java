package com.clurgo.nanorent.service.reservation;

import com.clurgo.nanorent.rest.reservation.model.ReservationDTO;

import java.util.List;

public interface ReservationService {

    ReservationDTO getReservationById(Long id);

    void addReservation(ReservationDTO reservationDTO);

    void deleteReservation(ReservationDTO reservationDTO);
}
