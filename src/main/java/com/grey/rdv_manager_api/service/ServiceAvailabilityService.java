package com.grey.rdv_manager_api.service;

import java.util.List;
import java.util.UUID;

import com.grey.rdv_manager_api.payload.request.CreateServiceAvailabilityRequest;
import com.grey.rdv_manager_api.payload.request.UpdateServiceAvailabilityRequest;
import com.grey.rdv_manager_api.payload.response.ServiceAvailabilityResponse;

public interface ServiceAvailabilityService {
    ServiceAvailabilityResponse create(UUID serviceId, CreateServiceAvailabilityRequest request);
    ServiceAvailabilityResponse getById(UUID id);
    List<ServiceAvailabilityResponse> getByServiceId(UUID serviceId);
    ServiceAvailabilityResponse update(UUID id, UpdateServiceAvailabilityRequest request);
    void delete(UUID id);
}
