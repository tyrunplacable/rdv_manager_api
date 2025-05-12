package com.grey.rdv_manager_api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.grey.rdv_manager_api.payload.request.CreateStructureRequest;
import com.grey.rdv_manager_api.payload.request.UpdateStructureRequest;
import com.grey.rdv_manager_api.payload.response.StructureResponse;
import com.grey.rdv_manager_api.service.StructureService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/structures")
@RequiredArgsConstructor
public class StructureController {

    private final StructureService structureService;

    @PostMapping
    public ResponseEntity<StructureResponse> createStructure(
            @Validated @RequestBody CreateStructureRequest request) {
        StructureResponse response = structureService.create(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StructureResponse> getStructure(@PathVariable UUID id) {
        StructureResponse response = structureService.getById(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<StructureResponse>> getAllStructures() {
        List<StructureResponse> list = structureService.getAll();
        return ResponseEntity.ok(list);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StructureResponse> updateStructure(
            @PathVariable UUID id,
            @Validated @RequestBody UpdateStructureRequest request) {
        StructureResponse response = structureService.update(id, request);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStructure(@PathVariable UUID id) {
        structureService.delete(id);
    }
}
