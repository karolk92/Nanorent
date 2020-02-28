package com.clurgo.nanorent.rest.reservation;

import com.clurgo.nanorent.rest.reservation.errors.AlreadyDefinedReservationException;
import com.clurgo.nanorent.rest.reservation.errors.NoReservationForSuchIdException;
import com.clurgo.nanorent.rest.reservation.errors.ReservationInPastException;
import com.clurgo.nanorent.rest.reservation.model.ReservationDto;
import com.clurgo.nanorent.rest.reservation.validation.ReservationValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class ReservationsRestController {

    private final ReservationValidator reservationValidator;

    @PostMapping("reservation")
    @ExceptionHandler({ AlreadyDefinedReservationException.class,
            ReservationInPastException.class,})
    @ResponseStatus(HttpStatus.CREATED)
    public void createReservation(@RequestBody ReservationDto reservationDto) {

    }

    @GetMapping("reservation")
    @ResponseStatus(HttpStatus.CREATED)
    public List<ReservationDto> getReservations() {

        return null;
    }

    @DeleteMapping("reservation/{id}")
    @ExceptionHandler({ NoReservationForSuchIdException.class, })
    @ResponseStatus(HttpStatus.OK)
    public void deleteReservations(@PathVariable("id") String reservationId) {

    }
}
