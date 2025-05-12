package com.grey.rdv_manager_api.payload.response;

import java.time.LocalDateTime;
import java.util.UUID;

public record AuditLogResponse(
    UUID id,
    String entityName,
    UUID entityId,
    String action,
    String performedBy,
    LocalDateTime timestamp
) {}