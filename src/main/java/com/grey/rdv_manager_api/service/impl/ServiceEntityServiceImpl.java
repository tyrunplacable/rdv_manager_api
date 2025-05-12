package com.grey.rdv_manager_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grey.rdv_manager_api.domain.model.ServiceEntity;
import com.grey.rdv_manager_api.mapper.ServiceEntityMapper;
import com.grey.rdv_manager_api.payload.request.CreateServiceRequest;
import com.grey.rdv_manager_api.payload.request.UpdateServiceRequest;
import com.grey.rdv_manager_api.payload.response.ServiceResponse;
import com.grey.rdv_manager_api.repository.ServiceRepository;
import com.grey.rdv_manager_api.service.ServiceEntityService;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ServiceEntityServiceImpl implements ServiceEntityService {

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