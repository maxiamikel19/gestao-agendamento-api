package com.maxiamikel.gestao_agendamento_api.services;

import com.maxiamikel.gestao_agendamento_api.dtos.requests.NotificationRequestDTO;
import com.maxiamikel.gestao_agendamento_api.dtos.responses.NotificationResponseDTO;

public interface NotificationService {
   NotificationResponseDTO saveNotification(NotificationRequestDTO objDto);
}
