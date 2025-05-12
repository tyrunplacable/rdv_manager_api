package repository;

import domain.model.Service;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.UUID;

public interface ServiceRepository extends MongoRepository<Service, UUID> {
    List<Service> findByStructureId(UUID structureId);
}