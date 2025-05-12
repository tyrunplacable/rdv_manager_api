package mapper;

import domain.model.Structure;
import payload.request.CreateStructureRequest;
import payload.request.UpdateStructureRequest;
import payload.response.StructureResponse;

import org.mapstruct.*;

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
