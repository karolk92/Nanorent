package com.clurgo.nanorent.service.reservation;

import com.clurgo.nanorent.entity.Reservation;
import com.clurgo.nanorent.repository.ReservationRepository;
import com.clurgo.nanorent.rest.reservation.model.ReservationDTO;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {

    private ReservationRepository reservationRepository;

    @Override
    public ReservationDTO getReservationById(Long id) {
        //todo optional
        Reservation reservation = reservationRepository.findById(id).orElseThrow();

        return ReservationDTO.builder()
                .id(reservation.getId())
                .username(reservation.getUsername())
                .startDate(reservation.getStartDate())
                .endDate(reservation.getEndDate())
                .resource(reservation.getResource())
                .build();
    }

    @Override
    public void addReservation(ReservationDTO reservationDTO) {
        Reservation reservation = mapToReservation(reservationDTO);

        reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(ReservationDTO reservationDTO) {
        Reservation reservation = mapToReservation(reservationDTO);

        reservationRepository.save(reservation);
    }

    private Reservation mapToReservation(ReservationDTO reservationDTO) {
        return Reservation.builder()
                .id(reservationDTO.getId())
                .username(reservationDTO.getUsername())
                .startDate(reservationDTO.getStartDate())
                .endDate(reservationDTO.getEndDate())
                .resource(reservationDTO.getResource())
                .build();
    }
}
