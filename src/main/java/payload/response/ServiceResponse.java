package payload.response;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

public record ServiceResponse(
        UUID id,
        UUID structureId,
        String name,
        String description,
        String timezone,
        Instant createdAt,
        Instant updatedAt
        ) {}
