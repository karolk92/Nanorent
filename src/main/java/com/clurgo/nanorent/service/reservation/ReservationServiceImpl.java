package com.clurgo.nanorent.service.reservation;

import com.clurgo.nanorent.entity.Reservation;
import com.clurgo.nanorent.repository.ReservationRepository;
import com.clurgo.nanorent.rest.reservation.model.ReservationDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public ReservationDTO getReservationById(Long id) {
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
        Reservation reservation = Reservation.builder()
                .username(reservationDTO.getUsername())
                .startDate(reservationDTO.getStartDate())
                .endDate(reservationDTO.getEndDate())
                .resource(reservationDTO.getResource())
                .build();

        reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservationById(Long id) {
        reservationRepository.deleteById(id);
    }
}
