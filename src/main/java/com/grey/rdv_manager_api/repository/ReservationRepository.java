package com.grey.rdv_manager_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.grey.rdv_manager_api.domain.enums.ReservationStatus;
import com.grey.rdv_manager_api.domain.model.Reservation;

import java.util.List;
import java.util.UUID;

public interface ReservationRepository extends MongoRepository<Reservation, UUID> {
    List<Reservation> findByClientId(UUID clientId);
    List<Reservation> findBySlotId(UUID slotId);
    List<Reservation> findByStatus(ReservationStatus status);
}
