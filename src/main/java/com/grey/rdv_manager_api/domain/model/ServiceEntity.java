package com.grey.rdv_manager_api.domain.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Service entity offered by a Structure.
 */
@Document(collection = "services")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServiceEntity {
    @Id
    private UUID id;

    /** Reference to the owning Structure */
    private UUID structureId;

    private String name;
    private String description;
    private String timezone;

    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
