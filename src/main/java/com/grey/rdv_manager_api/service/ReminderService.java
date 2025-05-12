package com.grey.rdv_manager_api.service;

import java.util.List;
import java.util.UUID;

import com.grey.rdv_manager_api.payload.request.CreateReminderRequest;
import com.grey.rdv_manager_api.payload.request.UpdateReminderRequest;
import com.grey.rdv_manager_api.payload.response.ReminderResponse;

public interface ReminderService {
    ReminderResponse create(CreateReminderRequest request);
    ReminderResponse getById(UUID id);
    List<ReminderResponse> getAll();
    ReminderResponse update(UUID id, UpdateReminderRequest request);
    void delete(UUID id);
}