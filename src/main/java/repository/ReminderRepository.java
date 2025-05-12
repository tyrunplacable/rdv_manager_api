package repository;

import domain.model.Reminder;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.UUID;

public interface ReminderRepository extends MongoRepository<Reminder, UUID> {
    List<Reminder> findByReservationId(UUID reservationId);
    List<Reminder> findBySentFalse();
}
