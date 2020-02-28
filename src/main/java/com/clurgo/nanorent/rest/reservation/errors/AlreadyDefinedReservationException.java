package com.clurgo.nanorent.rest.reservation.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="Ten zasób jest zarezerwowany dla podanych dat")
public class AlreadyDefinedReservationException extends RuntimeException {

}
