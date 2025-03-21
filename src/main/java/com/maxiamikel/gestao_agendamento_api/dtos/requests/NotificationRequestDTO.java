package com.maxiamikel.gestao_agendamento_api.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NotificationRequestDTO {

   private String destinationEmail;
   private String destinationPhone;
   private String textMessage;
}
