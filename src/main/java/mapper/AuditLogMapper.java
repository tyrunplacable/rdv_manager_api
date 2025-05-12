package mapper;

import domain.model.AuditLog;
import payload.response.AuditLogResponse;

import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuditLogMapper {

    AuditLogResponse toResponse(AuditLog entity);

    List<AuditLogResponse> toResponseList(List<AuditLog> entities);
}