package com.maxiamikel.gestao_agendamento_api.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponseException {
   private int status;
   private String message;
   private String timesTamp;
}
