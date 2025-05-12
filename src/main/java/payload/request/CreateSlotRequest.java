package payload.request;

import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public record CreateSlotRequest(
@NotNull UUID serviceId,
@NotNull LocalDate date,
@NotNull LocalTime startTime,
@NotNull LocalTime endTime,
@Min(1) int capacity
        ){}
