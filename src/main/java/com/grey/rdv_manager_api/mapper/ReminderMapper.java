package com.grey.rdv_manager_api.mapper;

import org.mapstruct.*;

import com.grey.rdv_manager_api.domain.model.Reminder;
import com.grey.rdv_manager_api.payload.request.CreateReminderRequest;
import com.grey.rdv_manager_api.payload.request.UpdateReminderRequest;
import com.grey.rdv_manager_api.payload.response.ReminderResponse;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReminderMapper {

    Reminder toEntity(CreateReminderRequest dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Reminder updateEntity(UpdateReminderRequest dto, @MappingTarget Reminder entity);

    ReminderResponse toResponse(Reminder entity);

    List<ReminderResponse> toResponseList(List<Reminder> entities);
}
