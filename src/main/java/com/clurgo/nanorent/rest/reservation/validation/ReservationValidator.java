package com.clurgo.nanorent.rest.reservation.validation;

import com.clurgo.nanorent.repository.ReservationRepository;
import com.clurgo.nanorent.rest.reservation.errors.AlreadyDefinedReservationException;
import com.clurgo.nanorent.rest.reservation.errors.ReservationInPastException;
import com.clurgo.nanorent.rest.reservation.model.ReservationDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class ReservationValidator {

    private final ReservationRepository reservationRepository;

    public void validate(ReservationDTO reservationDTO){
        checkReservationDateNotInPast(reservationDTO);
        checkReservationIsNotDefinedInRange(reservationDTO);
    }

    private void checkReservationDateNotInPast(ReservationDTO reservationDTO){
        if(reservationDTO.getStartDate().isBefore(LocalDate.now()) || reservationDTO.getEndDate().isBefore(LocalDate.now()))
            throw new ReservationInPastException();
    }

    private void checkReservationIsNotDefinedInRange(ReservationDTO reservationDTO){
        if(reservationRepository.countReservations(reservationDTO.getStartDate(), reservationDTO.getEndDate()) > 0)
            throw new AlreadyDefinedReservationException();
    }

}
