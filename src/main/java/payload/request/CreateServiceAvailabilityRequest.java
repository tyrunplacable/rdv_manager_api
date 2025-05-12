package payload.request;

import java.time.LocalTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record CreateServiceAvailabilityRequest(
@NotNull UUID serviceId,
@NotNull String dayOfWeek,
@NotNull LocalTime startTime,
@NotNull LocalTime endTime
        ) {}