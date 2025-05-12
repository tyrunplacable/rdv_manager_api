package service.impl;

import domain.model.Client;
import mapper.ClientMapper;
import payload.request.CreateClientRequest;
import payload.request.UpdateClientRequest;
import payload.response.ClientResponse;
import repository.ClientRepository;
import service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository repository;
    private final ClientMapper mapper;

    @Override
    @Transactional
    public ClientResponse create(CreateClientRequest request) {
        Client entity = mapper.toEntity(request);
        entity.setId(UUID.randomUUID());
        Client saved = repository.save(entity);
        return mapper.toResponse(saved);
    }

    @Override
    public ClientResponse getById(UUID id) {
        Client entity = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Client not found: " + id));
        return mapper.toResponse(entity);
    }

    @Override
    public List<ClientResponse> getAll() {
        return mapper.toResponseList(repository.findAll());
    }

    @Override
    @Transactional
    public ClientResponse update(UUID id, UpdateClientRequest request) {
        Client entity = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Client not found: " + id));
        mapper.updateEntity(request, entity);
        Client updated = repository.save(entity);
        return mapper.toResponse(updated);
    }

    @Override
    @Transactional
    public void delete(UUID id) {
        repository.deleteById(id);
    }
}