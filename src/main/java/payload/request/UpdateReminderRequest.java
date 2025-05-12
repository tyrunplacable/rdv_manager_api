package payload.request;

import domain.enums.ReminderMethod;
import java.time.LocalDateTime;

public record UpdateReminderRequest(
    LocalDateTime reminderTime,
    ReminderMethod method,
    Boolean sent
) {}