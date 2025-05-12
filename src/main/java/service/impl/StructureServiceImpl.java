package service.impl;

import domain.model.Structure;
import mapper.StructureMapper;
import payload.request.CreateStructureRequest;
import payload.request.UpdateStructureRequest;
import payload.response.StructureResponse;
import repository.StructureRepository;
import service.StructureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StructureServiceImpl implements StructureService {

    private final StructureRepository repository;
    private final StructureMapper mapper;

    @Override
    @Transactional
    public StructureResponse create(CreateStructureRequest request) {
        Structure entity = mapper.toEntity(request);
        entity.setId(UUID.randomUUID());
        Structure saved = repository.save(entity);
        return mapper.toResponse(saved);
    }

    @Override
    public StructureResponse getById(UUID id) {
        Structure entity = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Structure not found: " + id));
        return mapper.toResponse(entity);
    }

    @Override
    public List<StructureResponse> getAll() {
        return mapper.toResponseList(repository.findAll());
    }

    @Override
    @Transactional
    public StructureResponse update(UUID id, UpdateStructureRequest request) {
        Structure entity = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Structure not found: " + id));
        mapper.updateEntity(request, entity);
        Structure updated = repository.save(entity);
        return mapper.toResponse(updated);
    }

    @Override
    @Transactional
    public void delete(UUID id) {
        repository.deleteById(id);
    }
}

