package com.maxiamikel.gestao_agendamento_api.services.impl;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.maxiamikel.gestao_agendamento_api.dtos.requests.NotificationRequestDTO;
import com.maxiamikel.gestao_agendamento_api.dtos.responses.NotificationResponseDTO;
import com.maxiamikel.gestao_agendamento_api.entities.Notification;
import com.maxiamikel.gestao_agendamento_api.enums.NotoficationStatus;
import com.maxiamikel.gestao_agendamento_api.repositories.NotificationRepository;
import com.maxiamikel.gestao_agendamento_api.services.NotificationService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationServiceImpl implements NotificationService {

   private final NotificationRepository notificationRepository;

   @Override
   public NotificationResponseDTO saveNotification(NotificationRequestDTO objDto) {
      log.info("Preparando para ingresar una nurva notificacion");

      Notification obj = new Notification(null, objDto.getDestinationEmail(), objDto.getDestinationPhone(),
            LocalDateTime.now(), null, objDto.getTextMessage(), NotoficationStatus.SHELDULED);

      obj = notificationRepository.save(obj);
      log.info("Nueva notificacion ingresada con suceso");

      return new NotificationResponseDTO(obj);

   }
}
