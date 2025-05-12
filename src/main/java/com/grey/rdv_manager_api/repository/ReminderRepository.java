package com.grey.rdv_manager_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.grey.rdv_manager_api.domain.model.Reminder;

import java.util.List;
import java.util.UUID;

public interface ReminderRepository extends MongoRepository<Reminder, UUID> {
    List<Reminder> findByReservationId(UUID reservationId);
    List<Reminder> findBySentFalse();
}
