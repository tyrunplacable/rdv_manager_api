package payload.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateServiceAvailabilityRequest(
@NotNull UUID serviceId,
@NotNull String dayOfWeek,
@NotNull LocalTime startTime,
@NotNull LocalTime endTime
        ) {}