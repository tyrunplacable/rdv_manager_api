package service.impl;

import domain.model.Slot;
import mapper.SlotMapper;
import payload.request.CreateSlotRequest;
import payload.request.UpdateSlotRequest;
import payload.response.SlotResponse;
import repository.SlotRepository;
import service.SlotService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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