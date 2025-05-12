package com.grey.rdv_manager_api.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import com.grey.rdv_manager_api.domain.enums.Role;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Document(collection = "clients")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    private UUID id;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String passwordHash;

    private List<Role> roles;
    private UUID structureId; // Only for ADMIN and STAFF; null for CLIENT role

    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;
}

