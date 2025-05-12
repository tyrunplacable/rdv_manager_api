package repository;

import domain.model.Slot;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface SlotRepository extends MongoRepository<Slot, UUID> {
    List<Slot> findByServiceId(UUID serviceId);
    List<Slot> findByServiceIdAndDate(UUID serviceId, LocalDate date);
}
