package com.maxiamikel.gestao_agendamento_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maxiamikel.gestao_agendamento_api.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
