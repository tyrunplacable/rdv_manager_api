package com.grey.rdv_manager_api.mapper;

import org.mapstruct.*;

import com.grey.rdv_manager_api.domain.model.ServiceAvailability;
import com.grey.rdv_manager_api.payload.request.CreateServiceAvailabilityRequest;
import com.grey.rdv_manager_api.payload.request.UpdateServiceAvailabilityRequest;
import com.grey.rdv_manager_api.payload.response.ServiceAvailabilityResponse;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ServiceAvailabilityMapper {

    ServiceAvailability toEntity(CreateServiceAvailabilityRequest dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ServiceAvailability updateEntity(UpdateServiceAvailabilityRequest dto, @MappingTarget ServiceAvailability entity);

    ServiceAvailabilityResponse toResponse(ServiceAvailability entity);

    List<ServiceAvailabilityResponse> toResponseList(List<ServiceAvailability> entities);
}
