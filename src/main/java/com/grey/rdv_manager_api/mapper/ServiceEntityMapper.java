package com.grey.rdv_manager_api.mapper;

import org.mapstruct.*;

import com.grey.rdv_manager_api.domain.model.ServiceEntity;
import com.grey.rdv_manager_api.payload.request.CreateServiceRequest;
import com.grey.rdv_manager_api.payload.request.UpdateServiceRequest;
import com.grey.rdv_manager_api.payload.response.ServiceResponse;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ServiceEntityMapper {

    ServiceEntity toEntity(CreateServiceRequest dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ServiceEntity updateEntity(UpdateServiceRequest dto, @MappingTarget ServiceEntity entity);

    ServiceResponse toResponse(ServiceEntity entity);

    List<ServiceResponse> toResponseList(List<ServiceEntity> entities);
}
