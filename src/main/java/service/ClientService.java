package service;

import payload.request.CreateClientRequest;
import payload.request.UpdateClientRequest;
import payload.response.ClientResponse;

import java.util.List;
import java.util.UUID;

public interface ClientService {
    ClientResponse create(CreateClientRequest request);
    ClientResponse getById(UUID id);
    List<ClientResponse> getAll();
    ClientResponse update(UUID id, UpdateClientRequest request);
    void delete(UUID id);
}