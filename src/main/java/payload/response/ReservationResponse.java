package payload.response;

import java.time.Instant;
import java.util.UUID;

public record ReservationResponse(
    UUID id,
    UUID clientId,
    UUID slotId,
    String status,
    Instant createdAt,
    Instant updatedAt
) {}