package service;

import payload.request.CreateSlotRequest;
import payload.request.UpdateSlotRequest;
import payload.response.SlotResponse;

import java.util.List;
import java.util.UUID;

public interface SlotService {
    SlotResponse create(CreateSlotRequest request);
    SlotResponse getById(UUID id);
    List<SlotResponse> getAll();
    SlotResponse update(UUID id, UpdateSlotRequest request);
    void delete(UUID id);
}
