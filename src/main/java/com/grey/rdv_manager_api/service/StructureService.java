package com.grey.rdv_manager_api.service;

import java.util.List;
import java.util.UUID;

import com.grey.rdv_manager_api.payload.request.CreateStructureRequest;
import com.grey.rdv_manager_api.payload.request.UpdateStructureRequest;
import com.grey.rdv_manager_api.payload.response.StructureResponse;

public interface StructureService {
    StructureResponse create(CreateStructureRequest request);
    StructureResponse getById(UUID id);
    List<StructureResponse> getAll();
    StructureResponse update(UUID id, UpdateStructureRequest request);
    void delete(UUID id);
}