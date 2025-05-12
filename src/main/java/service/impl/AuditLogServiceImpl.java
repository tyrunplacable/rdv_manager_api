package service.impl;

import domain.model.AuditLog;
import mapper.AuditLogMapper;
import payload.response.AuditLogResponse;
import repository.AuditLogRepository;
import service.AuditLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuditLogServiceImpl implements AuditLogService {

    private final AuditLogRepository repository;
    private final AuditLogMapper mapper;

    @Override
    public AuditLogResponse getById(UUID id) {
        AuditLog entity = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("AuditLog not found: " + id));
        return mapper.toResponse(entity);
    }

    @Override
    public List<AuditLogResponse> getAll() {
        return mapper.toResponseList(repository.findAll());
    }

    @Override
    public List<AuditLogResponse> getByEntity(String entityName, UUID entityId) {
        List<AuditLog> logs = repository.findByEntityNameAndEntityId(entityName, entityId);
        return mapper.toResponseList(logs);
    }
}