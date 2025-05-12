package payload.response;

import java.time.LocalDateTime;
import java.util.UUID;

public record ReminderResponse(
    UUID id,
    UUID reservationId,
    LocalDateTime reminderTime,
    String method,
    boolean sent,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {}