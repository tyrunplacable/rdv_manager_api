package service;

import payload.request.CreateReservationRequest;
import payload.request.UpdateReservationRequest;
import payload.response.ReservationResponse;

import java.util.List;
import java.util.UUID;

public interface ReservationService {
    ReservationResponse create(CreateReservationRequest request);
    ReservationResponse getById(UUID id);
    List<ReservationResponse> getAll();
    ReservationResponse update(UUID id, UpdateReservationRequest request);
    void delete(UUID id);
}