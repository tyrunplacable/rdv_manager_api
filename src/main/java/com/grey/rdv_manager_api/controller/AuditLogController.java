package com.grey.rdv_manager_api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.grey.rdv_manager_api.payload.response.AuditLogResponse;
import com.grey.rdv_manager_api.service.AuditLogService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/audit-logs")
@RequiredArgsConstructor
public class AuditLogController {

    private final AuditLogService auditLogService;

    @GetMapping("/{id}")
    public ResponseEntity<AuditLogResponse> getAuditLog(@PathVariable UUID id) {
        AuditLogResponse response = auditLogService.getById(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<AuditLogResponse>> getAllAuditLogs() {
        List<AuditLogResponse> list = auditLogService.getAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/entity")
    public ResponseEntity<List<AuditLogResponse>> getAuditLogsByEntity(
            @RequestParam String entityName,
            @RequestParam UUID entityId) {
        List<AuditLogResponse> list = auditLogService.getByEntity(entityName, entityId);
        return ResponseEntity.ok(list);
    }
}