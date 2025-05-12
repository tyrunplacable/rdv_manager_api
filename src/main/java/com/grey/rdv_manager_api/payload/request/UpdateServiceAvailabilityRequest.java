package com.grey.rdv_manager_api.payload.request;

import java.time.LocalTime;

import com.grey.rdv_manager_api.domain.enums.Weekday;

public record UpdateServiceAvailabilityRequest(
    Weekday dayOfWeek,
    LocalTime startTime,
    LocalTime endTime
) {}
