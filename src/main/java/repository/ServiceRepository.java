package repository;

import domain.model.ServiceEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.UUID;

public interface ServiceRepository extends MongoRepository<ServiceEntity, UUID> {
    List<ServiceEntity> findByStructureId(UUID structureId);
}