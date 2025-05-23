package com.grey.rdv_manager_api.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Audit log for tracking create/update/delete actions on entities.
 */
@Document(collection = "audit_logs")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuditLog {
    @Id
    private UUID id;

    private String entityName;
    private UUID entityId;
    private String action;
    private String performedBy;
    private LocalDateTime timestamp;
    private String details;
}
