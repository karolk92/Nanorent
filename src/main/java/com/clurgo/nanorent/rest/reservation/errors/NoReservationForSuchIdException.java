package com.clurgo.nanorent.rest.reservation.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="Nie ma reservacji o podanym id")
public class NoReservationForSuchIdException extends RuntimeException {
}
