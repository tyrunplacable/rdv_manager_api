package payload.request;

import jakarta.validation.constraints.*;

import java.time.LocalDateTime;
import java.util.UUID;

public record CreateReminderRequest(
@NotNull UUID reservationId,
@NotNull LocalDateTime reminderTime,
@NotNull String method
        ) {}
