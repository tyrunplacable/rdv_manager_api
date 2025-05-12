package mapper;

import domain.model.Reminder;
import payload.request.CreateReminderRequest;
import payload.request.UpdateReminderRequest;
import payload.response.ReminderResponse;

import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReminderMapper {

    Reminder toEntity(CreateReminderRequest dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Reminder updateEntity(UpdateReminderRequest dto, @MappingTarget Reminder entity);

    ReminderResponse toResponse(Reminder entity);

    List<ReminderResponse> toResponseList(List<Reminder> entities);
}
