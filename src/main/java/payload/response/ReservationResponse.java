package payload.response;

import java.time.LocalDateTime;
import java.util.UUID;

public record ReservationResponse(
    UUID id,
    UUID clientId,
    UUID slotId,
    String status,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {}