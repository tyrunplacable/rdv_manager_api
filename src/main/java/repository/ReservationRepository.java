package repository;

import domain.model.Reservation;
import domain.enums.ReservationStatus;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.UUID;

public interface ReservationRepository extends MongoRepository<Reservation, UUID> {
    List<Reservation> findByClientId(UUID clientId);
    List<Reservation> findBySlotId(UUID slotId);
    List<Reservation> findByStatus(ReservationStatus status);
}
