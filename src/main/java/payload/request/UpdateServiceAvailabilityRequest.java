package payload.request;

import java.time.LocalTime;

import domain.enums.Weekday;

public record UpdateServiceAvailabilityRequest(
    Weekday dayOfWeek,
    LocalTime startTime,
    LocalTime endTime
) {}
