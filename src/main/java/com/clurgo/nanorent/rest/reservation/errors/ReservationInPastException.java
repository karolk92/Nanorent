package com.clurgo.nanorent.rest.reservation.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="Data zakończenia rezervacji jest w przeszłości")
public class ReservationInPastException extends RuntimeException {

}
