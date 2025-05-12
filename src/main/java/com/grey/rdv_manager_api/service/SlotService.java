package com.grey.rdv_manager_api.service;

import java.util.List;
import java.util.UUID;

import com.grey.rdv_manager_api.payload.request.CreateSlotRequest;
import com.grey.rdv_manager_api.payload.request.UpdateSlotRequest;
import com.grey.rdv_manager_api.payload.response.SlotResponse;

public interface SlotService {
    SlotResponse create(CreateSlotRequest request);
    SlotResponse getById(UUID id);
    List<SlotResponse> getAll();
    SlotResponse update(UUID id, UpdateSlotRequest request);
    void delete(UUID id);
}
