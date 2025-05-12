package com.grey.rdv_manager_api.service;

import java.util.List;
import java.util.UUID;

import com.grey.rdv_manager_api.payload.request.CreateServiceRequest;
import com.grey.rdv_manager_api.payload.request.UpdateServiceRequest;
import com.grey.rdv_manager_api.payload.response.ServiceResponse;

public interface ServiceEntityService {
    ServiceResponse create(CreateServiceRequest request);
    ServiceResponse getById(UUID id);
    List<ServiceResponse> getAll();
    ServiceResponse update(UUID id, UpdateServiceRequest request);
    void delete(UUID id);
}
