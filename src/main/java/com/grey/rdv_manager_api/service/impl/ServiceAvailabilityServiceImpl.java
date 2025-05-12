package com.grey.rdv_manager_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grey.rdv_manager_api.domain.model.ServiceAvailability;
import com.grey.rdv_manager_api.mapper.ServiceAvailabilityMapper;
import com.grey.rdv_manager_api.payload.request.CreateServiceAvailabilityRequest;
import com.grey.rdv_manager_api.payload.request.UpdateServiceAvailabilityRequest;
import com.grey.rdv_manager_api.payload.response.ServiceAvailabilityResponse;
import com.grey.rdv_manager_api.repository.ServiceAvailabilityRepository;
import com.grey.rdv_manager_api.service.ServiceAvailabilityService;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ServiceAvailabilityServiceImpl implements ServiceAvailabilityService {

    private final ServiceAvailabilityRepository repository;
    private final ServiceAvailabilityMapper mapper;

    @Override
    @Transactional
    public ServiceAvailabilityResponse create(UUID serviceId, CreateServiceAvailabilityRequest request) {
        ServiceAvailability entity = mapper.toEntity(request);
        entity.setId(UUID.randomUUID());
        entity.setServiceId(serviceId);             // link to parent Service
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
    public List<ServiceAvailabilityResponse> getByServiceId(UUID serviceId) {
        return mapper.toResponseList(repository.findByServiceId(serviceId));
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
