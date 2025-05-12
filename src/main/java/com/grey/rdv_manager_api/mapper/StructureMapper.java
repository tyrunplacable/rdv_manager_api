package com.grey.rdv_manager_api.mapper;

import org.mapstruct.*;

import com.grey.rdv_manager_api.domain.model.Structure;
import com.grey.rdv_manager_api.payload.request.CreateStructureRequest;
import com.grey.rdv_manager_api.payload.request.UpdateStructureRequest;
import com.grey.rdv_manager_api.payload.response.StructureResponse;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StructureMapper {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Structure toEntity(CreateStructureRequest dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Structure updateEntity(UpdateStructureRequest dto, @MappingTarget Structure entity);

    StructureResponse toResponse(Structure entity);

    List<StructureResponse> toResponseList(List<Structure> entities);
}
