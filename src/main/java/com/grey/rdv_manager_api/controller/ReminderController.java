package com.grey.rdv_manager_api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.grey.rdv_manager_api.payload.request.CreateReminderRequest;
import com.grey.rdv_manager_api.payload.request.UpdateReminderRequest;
import com.grey.rdv_manager_api.payload.response.ReminderResponse;
import com.grey.rdv_manager_api.service.ReminderService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/reminders")
@RequiredArgsConstructor
public class ReminderController {

    private final ReminderService reminderService;

    @PostMapping
    public ResponseEntity<ReminderResponse> createReminder(
            @Validated @RequestBody CreateReminderRequest request) {
        ReminderResponse response = reminderService.create(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReminderResponse> getReminder(@PathVariable UUID id) {
        ReminderResponse response = reminderService.getById(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<ReminderResponse>> getAllReminders() {
        List<ReminderResponse> list = reminderService.getAll();
        return ResponseEntity.ok(list);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReminderResponse> updateReminder(
            @PathVariable UUID id,
            @Validated @RequestBody UpdateReminderRequest request) {
        ReminderResponse response = reminderService.update(id, request);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteReminder(@PathVariable UUID id) {
        reminderService.delete(id);
    }
}