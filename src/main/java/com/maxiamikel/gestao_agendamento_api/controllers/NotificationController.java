package com.maxiamikel.gestao_agendamento_api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxiamikel.gestao_agendamento_api.dtos.requests.NotificationRequestDTO;
import com.maxiamikel.gestao_agendamento_api.dtos.responses.NotificationResponseDTO;
import com.maxiamikel.gestao_agendamento_api.services.impl.NotificationServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/agenda")
@RequiredArgsConstructor
public class NotificationController {

   private final NotificationServiceImpl notificationService;

   @PostMapping
   public ResponseEntity<NotificationResponseDTO> saveNotification(@RequestBody NotificationRequestDTO objDto) {
      return ResponseEntity.status(HttpStatus.CREATED).body(notificationService.saveNotification(objDto));
   }

   @GetMapping
   public ResponseEntity<String> teste() {
      return ResponseEntity.status(HttpStatus.OK).body("Funcionando");
   }

   @GetMapping("/{id}")
   public ResponseEntity<NotificationResponseDTO> findNotificationById(@PathVariable Long id) {
      return ResponseEntity.status(HttpStatus.OK).body(notificationService.findNotificationById(id));
   }

   @PutMapping("/{id}")
   public ResponseEntity<String> cancelNotificationById(@PathVariable Long id) {
      notificationService.cancelNotificationById(id);
      return ResponseEntity.ok().body("Cancelled");
   }

}
