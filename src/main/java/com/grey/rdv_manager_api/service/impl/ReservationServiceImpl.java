package com.grey.rdv_manager_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grey.rdv_manager_api.domain.model.Reservation;
import com.grey.rdv_manager_api.mapper.ReservationMapper;
import com.grey.rdv_manager_api.payload.request.CreateReservationRequest;
import com.grey.rdv_manager_api.payload.request.UpdateReservationRequest;
import com.grey.rdv_manager_api.payload.response.ReservationResponse;
import com.grey.rdv_manager_api.repository.ReservationRepository;
import com.grey.rdv_manager_api.service.ReservationService;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository repository;
    private final ReservationMapper mapper;

    @Override
    @Transactional
    public ReservationResponse create(CreateReservationRequest request) {
        Reservation entity = mapper.toEntity(request);
        entity.setId(UUID.randomUUID());
        Reservation saved = repository.save(entity);
        return mapper.toResponse(saved);
    }

    @Override
    public ReservationResponse getById(UUID id) {
        Reservation entity = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Reservation not found: " + id));
        return mapper.toResponse(entity);
    }

    @Override
    public List<ReservationResponse> getAll() {
        return mapper.toResponseList(repository.findAll());
    }

    @Override
    @Transactional
    public ReservationResponse update(UUID id, UpdateReservationRequest request) {
        Reservation entity = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Reservation not found: " + id));
        mapper.updateEntity(request, entity);
        Reservation updated = repository.save(entity);
        return mapper.toResponse(updated);
    }

    @Override
    @Transactional
    public void delete(UUID id) {
        repository.deleteById(id);
    }
}