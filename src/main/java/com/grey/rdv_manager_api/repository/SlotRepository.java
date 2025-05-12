package com.grey.rdv_manager_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.grey.rdv_manager_api.domain.model.Slot;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface SlotRepository extends MongoRepository<Slot, UUID> {
    List<Slot> findByServiceId(UUID serviceId);
    List<Slot> findByServiceIdAndDate(UUID serviceId, LocalDate date);
}
