package repository;

import domain.model.ServiceAvailability;
import domain.enums.Weekday;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.UUID;

public interface ServiceAvailabilityRepository extends MongoRepository<ServiceAvailability, UUID> {
    List<ServiceAvailability> findByServiceId(UUID serviceId);
    List<ServiceAvailability> findByServiceIdAndDayOfWeek(UUID serviceId, Weekday dayOfWeek);
}
