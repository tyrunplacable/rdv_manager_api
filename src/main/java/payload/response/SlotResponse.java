package payload.response;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public record SlotResponse(
    UUID id,
    UUID serviceId,
    LocalDate date,
    LocalTime startTime,
    LocalTime endTime,
    int capacity,
    int available,
    Instant createdAt,
    Instant updatedAt
) {}
