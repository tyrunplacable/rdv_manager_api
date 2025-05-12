package repository;

import domain.model.Structure;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.UUID;

public interface StructureRepository extends MongoRepository<Structure, UUID> {
    
}