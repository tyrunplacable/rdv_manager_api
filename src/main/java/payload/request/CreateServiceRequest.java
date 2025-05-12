package payload.request;

import jakarta.validation.constraints.*;

import java.util.UUID;

public record CreateServiceRequest(
@NotNull UUID structureId,
@NotBlank String name,
        String description,
@NotBlank String timezone
        ) {}