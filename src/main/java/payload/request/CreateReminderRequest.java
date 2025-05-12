package payload.request;

import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

public record CreateReminderRequest(
@NotNull UUID reservationId,
@NotNull Instant reminderTime,
@NotNull String method
        ) {}
