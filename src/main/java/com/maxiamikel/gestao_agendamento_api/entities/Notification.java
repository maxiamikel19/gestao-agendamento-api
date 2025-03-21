package com.maxiamikel.gestao_agendamento_api.entities;

import java.time.LocalDateTime;

import com.maxiamikel.gestao_agendamento_api.enums.NotoficationStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "notification_tb")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Notification {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String destinationEmail;
   private String destinationPhone;
   private LocalDateTime sentDateTime;
   private LocalDateTime modifiedDateTime;
   private String textMessage;
   private NotoficationStatus notoficationStatus;

}
