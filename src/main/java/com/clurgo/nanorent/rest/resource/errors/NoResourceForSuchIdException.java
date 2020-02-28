package com.clurgo.nanorent.rest.resource.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="Nie ma reservacji o podanym id")
public class NoResourceForSuchIdException extends RuntimeException {
}
