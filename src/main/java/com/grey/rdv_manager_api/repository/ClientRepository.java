package com.grey.rdv_manager_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.grey.rdv_manager_api.domain.model.Client;

import java.util.List;
import java.util.UUID;

public interface ClientRepository extends MongoRepository<Client, UUID> {
    List<Client> findByStructureId(UUID structureId);

    Client findByEmail(String email);
}
