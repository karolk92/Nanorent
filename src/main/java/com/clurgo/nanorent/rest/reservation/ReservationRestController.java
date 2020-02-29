package com.clurgo.nanorent.rest.reservation;

import com.clurgo.nanorent.rest.reservation.errors.AlreadyDefinedReservationException;
import com.clurgo.nanorent.rest.reservation.errors.ReservationNotFoundException;
import com.clurgo.nanorent.rest.reservation.errors.ReservationInPastException;
import com.clurgo.nanorent.rest.reservation.model.ReservationDTO;
import com.clurgo.nanorent.rest.reservation.validation.ReservationValidator;
import com.clurgo.nanorent.service.reservation.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class ReservationRestController {

    private final ReservationValidator reservationValidator;
    private final ReservationService reservationService;

    @PostMapping("category/resource/reservation")
    @ExceptionHandler({ AlreadyDefinedReservationException.class,
            ReservationInPastException.class,})
    @ResponseStatus(HttpStatus.CREATED)
    public void createReservation(@RequestBody ReservationDTO reservationDto) {
        reservationValidator.validate(reservationDto);

    }

    @GetMapping("category/resource/reservation/{recourseId}")
    @ResponseStatus(HttpStatus.CREATED)
    public List<ReservationDTO> getReservations(@PathVariable("recourseId") String recourseId) {

        return null;
    }

    @DeleteMapping("category/resource/reservation/{reservationId}")
    @ExceptionHandler({ ReservationNotFoundException.class, })
    @ResponseStatus(HttpStatus.OK)
    public void deleteReservations(@PathVariable("reservationId") String reservationId) {

    }
}
