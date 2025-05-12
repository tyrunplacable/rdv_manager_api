package payload.request;

import domain.enums.ReminderMethod;

import java.time.Instant;

public record UpdateReminderRequest(
    Instant reminderTime,
    ReminderMethod method,
    Boolean sent
) {}