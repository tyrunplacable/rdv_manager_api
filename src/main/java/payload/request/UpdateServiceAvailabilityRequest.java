package payload.request;

import java.time.LocalTime;
import java.time.DayOfWeek;

public record UpdateServiceAvailabilityRequest(
    DayOfWeek dayOfWeek,
    LocalTime startTime,
    LocalTime endTime
) {}
