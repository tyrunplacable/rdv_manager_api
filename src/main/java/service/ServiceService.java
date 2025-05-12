package service;

import payload.request.CreateServiceRequest;
import payload.request.UpdateServiceRequest;
import payload.response.ServiceResponse;

import java.util.List;
import java.util.UUID;

public interface ServiceService {
    ServiceResponse create(CreateServiceRequest request);
    ServiceResponse getById(UUID id);
    List<ServiceResponse> getAll();
    ServiceResponse update(UUID id, UpdateServiceRequest request);
    void delete(UUID id);
}
