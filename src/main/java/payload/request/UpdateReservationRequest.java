package payload.request;

import domain.enums.ReservationStatus;

public record UpdateReservationRequest(
    ReservationStatus status
) {}
