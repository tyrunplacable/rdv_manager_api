package mapper;

import domain.model.Service;
import payload.request.CreateServiceRequest;
import payload.request.UpdateServiceRequest;
import payload.response.ServiceResponse;

import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ServiceMapper {

    Service toEntity(CreateServiceRequest dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Service updateEntity(UpdateServiceRequest dto, @MappingTarget Service entity);

    ServiceResponse toResponse(Service entity);

    List<ServiceResponse> toResponseList(List<Service> entities);
}
