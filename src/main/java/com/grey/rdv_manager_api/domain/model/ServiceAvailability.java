package com.grey.rdv_manager_api.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import com.grey.rdv_manager_api.domain.enums.Weekday;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

/**
 * Weekly availability schedule for a Service on a specific day of week.
 */
@Document(collection = "service_availability")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServiceAvailability {
    @Id
    private UUID id;

    /** Reference to the Service */
    private UUID serviceId;

    private Weekday dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;
}

