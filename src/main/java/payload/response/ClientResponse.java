package payload.response;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
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
        Instant createdAt,
        Instant updatedAt
        ) {}
