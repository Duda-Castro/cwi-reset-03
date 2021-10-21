package br.com.cwi.reset.dudacastro.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CanseiDeCriarExceptionCustomizadaException extends Exception {
    public CanseiDeCriarExceptionCustomizadaException(String message) {
        super(message);
    }
}