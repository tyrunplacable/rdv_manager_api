package mapper;

import domain.model.ServiceEntity;
import payload.request.CreateServiceRequest;
import payload.request.UpdateServiceRequest;
import payload.response.ServiceResponse;

import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ServiceEntityMapper {

    ServiceEntity toEntity(CreateServiceRequest dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ServiceEntity updateEntity(UpdateServiceRequest dto, @MappingTarget ServiceEntity entity);

    ServiceResponse toResponse(ServiceEntity entity);

    List<ServiceResponse> toResponseList(List<ServiceEntity> entities);
}
