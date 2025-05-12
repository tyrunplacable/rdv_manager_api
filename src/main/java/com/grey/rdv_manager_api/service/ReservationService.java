package com.grey.rdv_manager_api.service;

import java.util.List;
import java.util.UUID;

import com.grey.rdv_manager_api.payload.request.CreateReservationRequest;
import com.grey.rdv_manager_api.payload.request.UpdateReservationRequest;
import com.grey.rdv_manager_api.payload.response.ReservationResponse;

public interface ReservationService {
    ReservationResponse create(CreateReservationRequest request);
    ReservationResponse getById(UUID id);
    List<ReservationResponse> getAll();
    ReservationResponse update(UUID id, UpdateReservationRequest request);
    void delete(UUID id);
}