package com.grey.rdv_manager_api.payload.request;

import java.time.LocalDateTime;

import com.grey.rdv_manager_api.domain.enums.ReminderMethod;

public record UpdateReminderRequest(
    LocalDateTime reminderTime,
    ReminderMethod method,
    Boolean sent
) {}