package com.maxiamikel.gestao_agendamento_api.dtos.responses;

import java.time.LocalDateTime;

import com.maxiamikel.gestao_agendamento_api.entities.Notification;
import com.maxiamikel.gestao_agendamento_api.enums.NotoficationStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NotificationResponseDTO {
   private Long id;
   private String destinationEmail;
   private String destinationPhone;
   private LocalDateTime sentDateTime;
   private LocalDateTime modifiedDateTime;
   private String textMessage;
   private NotoficationStatus notoficationStatus;

   public NotificationResponseDTO(Notification notification) {
      this.id = notification.getId();
      this.destinationEmail = notification.getDestinationEmail();
      this.destinationPhone = notification.getDestinationPhone();
      this.notoficationStatus = notification.getNotoficationStatus();
      this.sentDateTime = notification.getSentDateTime();
      this.modifiedDateTime = notification.getModifiedDateTime();
      this.textMessage = notification.getTextMessage();
   }
}
