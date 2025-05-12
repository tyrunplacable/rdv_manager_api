package com.grey.rdv_manager_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grey.rdv_manager_api.domain.model.Slot;
import com.grey.rdv_manager_api.mapper.SlotMapper;
import com.grey.rdv_manager_api.payload.request.CreateSlotRequest;
import com.grey.rdv_manager_api.payload.request.UpdateSlotRequest;
import com.grey.rdv_manager_api.payload.response.SlotResponse;
import com.grey.rdv_manager_api.repository.SlotRepository;
import com.grey.rdv_manager_api.service.SlotService;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SlotServiceImpl implements SlotService {

    private final SlotRepository repository;
    private final SlotMapper mapper;

    @Override
    @Transactional
    public SlotResponse create(CreateSlotRequest request) {
        Slot entity = mapper.toEntity(request);
        entity.setId(UUID.randomUUID());
        Slot saved = repository.save(entity);
        return mapper.toResponse(saved);
    }

    @Override
    public SlotResponse getById(UUID id) {
        Slot entity = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Slot not found: " + id));
        return mapper.toResponse(entity);
    }

    @Override
    public List<SlotResponse> getAll() {
        return mapper.toResponseList(repository.findAll());
    }

    @Override
    @Transactional
    public SlotResponse update(UUID id, UpdateSlotRequest request) {
        Slot entity = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Slot not found: " + id));
        mapper.updateEntity(request, entity);
        Slot updated = repository.save(entity);
        return mapper.toResponse(updated);
    }

    @Override
    @Transactional
    public void delete(UUID id) {
        repository.deleteById(id);
    }
}