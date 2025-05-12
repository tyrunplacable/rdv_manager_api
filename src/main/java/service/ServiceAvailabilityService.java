package service;

import payload.request.CreateServiceAvailabilityRequest;
import payload.request.UpdateServiceAvailabilityRequest;
import payload.response.ServiceAvailabilityResponse;

import java.util.List;
import java.util.UUID;

public interface ServiceAvailabilityService {
    ServiceAvailabilityResponse create(CreateServiceAvailabilityRequest request);
    ServiceAvailabilityResponse getById(UUID id);
    List<ServiceAvailabilityResponse> getAll();
    ServiceAvailabilityResponse update(UUID id, UpdateServiceAvailabilityRequest request);
    void delete(UUID id);
}
