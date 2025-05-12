package com.grey.rdv_manager_api.payload.request;

import java.time.LocalDate;
import java.time.LocalTime;

public record UpdateSlotRequest(
    LocalDate date,
    LocalTime startTime,
    LocalTime endTime,
    Integer capacity,
    Integer available
) {}
