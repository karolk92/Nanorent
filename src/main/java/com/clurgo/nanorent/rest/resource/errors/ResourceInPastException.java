package com.clurgo.nanorent.rest.resource.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="Data zakończenia rezervacji jest w przeszłości")
public class ResourceInPastException extends RuntimeException {

}
