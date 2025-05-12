package com.grey.rdv_manager_api.mapper;

import org.mapstruct.*;

import com.grey.rdv_manager_api.domain.model.Slot;
import com.grey.rdv_manager_api.payload.request.CreateSlotRequest;
import com.grey.rdv_manager_api.payload.request.UpdateSlotRequest;
import com.grey.rdv_manager_api.payload.response.SlotResponse;

import java.util.List;


@Mapper(componentModel = "spring")
public interface SlotMapper {

    @Mapping(target = "available", ignore = true)
    Slot toEntity(CreateSlotRequest dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Slot updateEntity(UpdateSlotRequest dto, @MappingTarget Slot entity);

    SlotResponse toResponse(Slot entity);

    List<SlotResponse> toResponseList(List<Slot> entities);
}