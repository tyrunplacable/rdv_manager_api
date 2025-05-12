package payload.response;

import java.time.LocalDateTime;
import java.util.UUID;

public record StructureResponse(
        UUID id,
        String name,
        String description,
        String address,
        String phone,
        String email,
        String timezone,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
        ) {}
