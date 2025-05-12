package service.impl;

import domain.model.ServiceEntity;
import mapper.ServiceEntityMapper;
import payload.request.CreateServiceRequest;
import payload.request.UpdateServiceRequest;
import payload.response.ServiceResponse;
import repository.ServiceRepository;
import service.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ServiceServiceImpl implements ServiceService {

    private final ServiceRepository repository;
    private final ServiceEntityMapper mapper;

    @Override
    @Transactional
    public ServiceResponse create(CreateServiceRequest request) {
        ServiceEntity entity = mapper.toEntity(request);
        entity.setId(UUID.randomUUID());
        ServiceEntity saved = repository.save(entity);
        return mapper.toResponse(saved);
    }

    @Override
    public ServiceResponse getById(UUID id) {
        ServiceEntity entity = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Service not found: " + id));
        return mapper.toResponse(entity);
    }

    @Override
    public List<ServiceResponse> getAll() {
        return mapper.toResponseList(repository.findAll());
    }

    @Override
    @Transactional
    public ServiceResponse update(UUID id, UpdateServiceRequest request) {
        ServiceEntity entity = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Service not found: " + id));
        mapper.updateEntity(request, entity);
        ServiceEntity updated = repository.save(entity);
        return mapper.toResponse(updated);
    }

    @Override
    @Transactional
    public void delete(UUID id) {
        repository.deleteById(id);
    }
}