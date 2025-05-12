package com.grey.rdv_manager_api.payload.request;

import com.grey.rdv_manager_api.domain.enums.ReservationStatus;

public record UpdateReservationRequest(
    ReservationStatus status
) {}
