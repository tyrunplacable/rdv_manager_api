package payload.request;

import jakarta.validation.constraints.*;

import java.time.Instant;
import java.util.UUID;

public record CreateReminderRequest(
@NotNull UUID reservationId,
@NotNull Instant reminderTime,
@NotNull String method
        ) {}
