package com.grey.rdv_manager_api.service;

import java.util.List;
import java.util.UUID;

import com.grey.rdv_manager_api.payload.response.AuditLogResponse;

public interface AuditLogService {
    AuditLogResponse getById(UUID id);
    List<AuditLogResponse> getAll();
    List<AuditLogResponse> getByEntity(String entityName, UUID entityId);
}