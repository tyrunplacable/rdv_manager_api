package com.grey.rdv_manager_api.service;

import java.util.List;
import java.util.UUID;

import com.grey.rdv_manager_api.payload.request.CreateClientRequest;
import com.grey.rdv_manager_api.payload.request.UpdateClientRequest;
import com.grey.rdv_manager_api.payload.response.ClientResponse;

public interface ClientService {
    ClientResponse create(CreateClientRequest request);
    ClientResponse getById(UUID id);
    List<ClientResponse> getAll();
    ClientResponse update(UUID id, UpdateClientRequest request);
    void delete(UUID id);
}