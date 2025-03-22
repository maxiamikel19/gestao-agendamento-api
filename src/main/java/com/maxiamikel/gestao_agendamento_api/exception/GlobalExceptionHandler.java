package com.maxiamikel.gestao_agendamento_api.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

   @ExceptionHandler(NotFoundException.class)
   public ResponseEntity<?> handlerNotFoundException(NotFoundException ex) {
      ErrorResponseException err = new ErrorResponseException(HttpStatus.NOT_FOUND.value(), ex.getMessage(),
            LocalDateTime.now().toLocalTime().toString().substring(0, 8));
      return new ResponseEntity<>(err, HttpStatus.NOT_FOUND);
   }

   @ExceptionHandler(BadRequestException.class)
   public ResponseEntity<?> handlerBadRequestException(BadRequestException ex) {
      ErrorResponseException err = new ErrorResponseException(HttpStatus.BAD_REQUEST.value(), ex.getMessage(),
            LocalDateTime.now().toLocalTime().toString().substring(0, 8));
      return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
   }

}
