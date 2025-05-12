package payload.request;

import jakarta.validation.constraints.*;

public record CreateSlotRequest(
@NotNull UUID serviceId,
@NotNull LocalDate date,
@NotNull LocalTime startTime,
@NotNull LocalTime endTime,
@Min(1) int capacity
        ){}
