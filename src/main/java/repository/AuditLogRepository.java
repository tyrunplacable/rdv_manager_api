package repository;

import domain.model.AuditLog;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.UUID;

public interface AuditLogRepository extends MongoRepository<AuditLog, UUID> {
    List<AuditLog> findByEntityNameAndEntityId(String entityName, UUID entityId);
}