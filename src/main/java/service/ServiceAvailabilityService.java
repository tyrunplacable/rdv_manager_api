package service;

import payload.request.CreateServiceAvailabilityRequest;
import payload.request.UpdateServiceAvailabilityRequest;
import payload.response.ServiceAvailabilityResponse;

import java.util.List;
import java.util.UUID;

public interface ServiceAvailabilityService {
    ServiceAvailabilityResponse create(UUID serviceId, CreateServiceAvailabilityRequest request);
    ServiceAvailabilityResponse getById(UUID id);
    List<ServiceAvailabilityResponse> getByServiceId(UUID serviceId);
    ServiceAvailabilityResponse update(UUID id, UpdateServiceAvailabilityRequest request);
    void delete(UUID id);
}
