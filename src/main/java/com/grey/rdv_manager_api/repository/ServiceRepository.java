package com.grey.rdv_manager_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.grey.rdv_manager_api.domain.model.ServiceEntity;

import java.util.List;
import java.util.UUID;

public interface ServiceRepository extends MongoRepository<ServiceEntity, UUID> {
    List<ServiceEntity> findByStructureId(UUID structureId);
}