package payload.response;

import java.time.LocalDateTime;
import java.util.UUID;

public record ServiceResponse(
        UUID id,
        UUID structureId,
        String name,
        String description,
        String timezone,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
        ) {}
