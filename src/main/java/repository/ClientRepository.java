package repository;

import domain.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.UUID;

public interface ClientRepository extends MongoRepository<Client, UUID> {
    List<Client> findByStructureId(UUID structureId);

    Client findByEmail(String email);
}
