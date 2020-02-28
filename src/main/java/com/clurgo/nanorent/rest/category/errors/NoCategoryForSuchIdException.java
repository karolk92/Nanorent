package com.clurgo.nanorent.rest.category.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="Nie ma reservacji o podanym id")
public class NoCategoryForSuchIdException extends RuntimeException {
}
