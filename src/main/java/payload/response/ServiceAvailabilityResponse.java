package payload.response;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

public record ServiceAvailabilityResponse(
        UUID id,
        UUID serviceId,
        String dayOfWeek,
        LocalTime startTime,
        LocalTime endTime,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
        ) {}
