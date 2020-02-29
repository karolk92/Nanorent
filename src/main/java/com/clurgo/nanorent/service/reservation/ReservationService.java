package com.clurgo.nanorent.service.reservation;

import com.clurgo.nanorent.rest.reservation.model.ReservationDTO;

public interface ReservationService {

    ReservationDTO getReservationById(Long id);

    void addReservation(ReservationDTO reservationDTO);

    void deleteReservationById(Long id);
}
