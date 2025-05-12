package service;

import payload.response.AuditLogResponse;

import java.util.List;
import java.util.UUID;

public interface AuditLogService {
    AuditLogResponse getById(UUID id);
    List<AuditLogResponse> getAll();
    List<AuditLogResponse> getByEntity(String entityName, UUID entityId);
}