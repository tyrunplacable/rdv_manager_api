package mapper;

import domain.model.Slot;
import payload.request.CreateSlotRequest;
import payload.request.UpdateSlotRequest;
import payload.response.SlotResponse;

import org.mapstruct.*;

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