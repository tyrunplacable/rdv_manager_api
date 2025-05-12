package payload.response;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

public record ServiceAvailabilityResponse(
        UUID id,
        UUID serviceId,
        String dayOfWeek,
        LocalTime startTime,
        LocalTime endTime,
        Instant createdAt,
        Instant updatedAt
        ) {}
