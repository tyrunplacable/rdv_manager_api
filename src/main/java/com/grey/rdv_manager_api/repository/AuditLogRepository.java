package com.grey.rdv_manager_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.grey.rdv_manager_api.domain.model.AuditLog;

import java.util.List;
import java.util.UUID;

public interface AuditLogRepository extends MongoRepository<AuditLog, UUID> {
    List<AuditLog> findByEntityNameAndEntityId(String entityName, UUID entityId);
}