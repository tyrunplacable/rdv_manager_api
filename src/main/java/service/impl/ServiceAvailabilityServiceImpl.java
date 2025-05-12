package service.impl;

import domain.model.ServiceAvailability;
import mapper.ServiceAvailabilityMapper;
import payload.request.CreateServiceAvailabilityRequest;
import payload.request.UpdateServiceAvailabilityRequest;
import payload.response.ServiceAvailabilityResponse;
import repository.ServiceAvailabilityRepository;
import service.ServiceAvailabilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ServiceAvailabilityServiceImpl implements ServiceAvailabilityService {

    private final ServiceAvailabilityRepository repository;
    private final ServiceAvailabilityMapper mapper;

    @Override
    @Transactional
    public ServiceAvailabilityResponse create(CreateServiceAvailabilityRequest request) {
        ServiceAvailability entity = mapper.toEntity(request);
        entity.setId(UUID.randomUUID());
        ServiceAvailability saved = repository.save(entity);
        return mapper.toResponse(saved);
    }

    @Override
    public ServiceAvailabilityResponse getById(UUID id) {
        ServiceAvailability entity = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("ServiceAvailability not found: " + id));
        return mapper.toResponse(entity);
    }

    @Override
    public List<ServiceAvailabilityResponse> getAll() {
        return mapper.toResponseList(repository.findAll());
    }

    @Override
    @Transactional
    public ServiceAvailabilityResponse update(UUID id, UpdateServiceAvailabilityRequest request) {
        ServiceAvailability entity = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("ServiceAvailability not found: " + id));
        mapper.updateEntity(request, entity);
        ServiceAvailability updated = repository.save(entity);
        return mapper.toResponse(updated);
    }

    @Override
    @Transactional
    public void delete(UUID id) {
        repository.deleteById(id);
    }
}