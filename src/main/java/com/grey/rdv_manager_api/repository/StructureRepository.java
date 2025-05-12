package com.grey.rdv_manager_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.grey.rdv_manager_api.domain.model.Structure;

import java.util.UUID;

public interface StructureRepository extends MongoRepository<Structure, UUID> {
    
}