package com.clurgo.nanorent.service.reservation;

import com.clurgo.nanorent.rest.reservation.model.ReservationDTO;

import java.util.List;

public interface ReservationService {

    List<ReservationDTO> getReservationsByResourceId(Long id);

    ReservationDTO getReservationById(Long id);

    void addReservation(ReservationDTO reservationDTO);

    void deleteReservationById(Long id);
}
