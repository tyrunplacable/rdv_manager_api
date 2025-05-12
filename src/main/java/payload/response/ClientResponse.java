package payload.response;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record ClientResponse(
        UUID id,
        String firstName,
        String lastName,
        String email,
        String phone,
        List<String> roles,
        UUID structureId,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
        ) {}
