package service.impl;

import domain.model.Reminder;
import mapper.ReminderMapper;
import payload.request.CreateReminderRequest;
import payload.request.UpdateReminderRequest;
import payload.response.ReminderResponse;
import repository.ReminderRepository;
import service.ReminderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ReminderServiceImpl implements ReminderService {

    private final ReminderRepository repository;
    private final ReminderMapper mapper;

    @Override
    @Transactional
    public ReminderResponse create(CreateReminderRequest request) {
        Reminder entity = mapper.toEntity(request);
        entity.setId(UUID.randomUUID());
        Reminder saved = repository.save(entity);
        return mapper.toResponse(saved);
    }

    @Override
    public ReminderResponse getById(UUID id) {
        Reminder entity = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Reminder not found: " + id));
        return mapper.toResponse(entity);
    }

    @Override
    public List<ReminderResponse> getAll() {
        return mapper.toResponseList(repository.findAll());
    }

    @Override
    @Transactional
    public ReminderResponse update(UUID id, UpdateReminderRequest request) {
        Reminder entity = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Reminder not found: " + id));
        mapper.updateEntity(request, entity);
        Reminder updated = repository.save(entity);
        return mapper.toResponse(updated);
    }

    @Override
    @Transactional
    public void delete(UUID id) {
        repository.deleteById(id);
    }
}