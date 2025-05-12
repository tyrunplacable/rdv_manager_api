package service;

import payload.request.CreateReminderRequest;
import payload.request.UpdateReminderRequest;
import payload.response.ReminderResponse;

import java.util.List;
import java.util.UUID;

public interface ReminderService {
    ReminderResponse create(CreateReminderRequest request);
    ReminderResponse getById(UUID id);
    List<ReminderResponse> getAll();
    ReminderResponse update(UUID id, UpdateReminderRequest request);
    void delete(UUID id);
}