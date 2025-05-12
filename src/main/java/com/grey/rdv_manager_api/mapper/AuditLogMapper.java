package com.grey.rdv_manager_api.mapper;

import org.mapstruct.*;

import com.grey.rdv_manager_api.domain.model.AuditLog;
import com.grey.rdv_manager_api.payload.response.AuditLogResponse;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuditLogMapper {

    AuditLogResponse toResponse(AuditLog entity);

    List<AuditLogResponse> toResponseList(List<AuditLog> entities);
}