package payload.response;

import java.time.Instant;
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
