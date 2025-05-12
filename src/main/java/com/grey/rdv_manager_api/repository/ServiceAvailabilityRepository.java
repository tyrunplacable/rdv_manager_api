package com.grey.rdv_manager_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.grey.rdv_manager_api.domain.enums.Weekday;
import com.grey.rdv_manager_api.domain.model.ServiceAvailability;

import java.util.List;
import java.util.UUID;

public interface ServiceAvailabilityRepository extends MongoRepository<ServiceAvailability, UUID> {
    List<ServiceAvailability> findByServiceId(UUID serviceId);
    List<ServiceAvailability> findByServiceIdAndDayOfWeek(UUID serviceId, Weekday dayOfWeek);
}
