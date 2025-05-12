package payload.response;

import java.time.Instant;
import java.util.UUID;

public record ReminderResponse(
    UUID id,
    UUID reservationId,
    Instant reminderTime,
    String method,
    boolean sent,
    Instant createdAt,
    Instant updatedAt
) {}