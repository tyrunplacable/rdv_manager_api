package service;

import payload.request.CreateStructureRequest;
import payload.request.UpdateStructureRequest;
import payload.response.StructureResponse;

import java.util.List;
import java.util.UUID;

public interface StructureService {
    StructureResponse create(CreateStructureRequest request);
    StructureResponse getById(UUID id);
    List<StructureResponse> getAll();
    StructureResponse update(UUID id, UpdateStructureRequest request);
    void delete(UUID id);
}