package com.grey.rdv_manager_api.payload.request;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record CreateReservationRequest(
@NotNull UUID clientId,
@NotNull UUID slotId
        ) {}