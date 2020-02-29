package com.clurgo.nanorent.rest.reservation;

import com.clurgo.nanorent.rest.reservation.errors.AlreadyDefinedReservationException;
import com.clurgo.nanorent.rest.reservation.errors.ReservationInPastException;
import com.clurgo.nanorent.rest.reservation.errors.ReservationNotFoundException;
import com.clurgo.nanorent.rest.reservation.model.ReservationDTO;
import com.clurgo.nanorent.rest.reservation.validation.ReservationValidator;
import com.clurgo.nanorent.service.reservation.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/reservations")
public class ReservationRestController {

    private final ReservationValidator reservationValidator;
    private final ReservationService reservationService;

    @PostMapping
    @ExceptionHandler({ AlreadyDefinedReservationException.class,
            ReservationInPastException.class})
    @ResponseStatus(HttpStatus.CREATED)
    public void createReservation(@RequestBody ReservationDTO reservationDTO) {
        reservationValidator.validate(reservationDTO);

        reservationService.addReservation(reservationDTO);
    }

    @GetMapping("/resource")
    @ResponseStatus(HttpStatus.OK)
    public List<ReservationDTO> getReservationsByResourceId(@RequestParam("id") Long id) {

        return reservationService.getReservationsByResourceId(id);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ReservationDTO getReservationById(@PathVariable("id") Long id) {

        return reservationService.getReservationById(id);
    }

    @DeleteMapping("{id}")
    @ExceptionHandler({ ReservationNotFoundException.class, })
    @ResponseStatus(HttpStatus.OK)
    public void deleteReservationById(@PathVariable("id") Long id) {
        reservationService.deleteReservationById(id);
    }
}
