package mapper;

import domain.model.ServiceAvailability;
import payload.request.CreateServiceAvailabilityRequest;
import payload.request.UpdateServiceAvailabilityRequest;
import payload.response.ServiceAvailabilityResponse;

import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ServiceAvailabilityMapper {

    ServiceAvailability toEntity(CreateServiceAvailabilityRequest dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ServiceAvailability updateEntity(UpdateServiceAvailabilityRequest dto, @MappingTarget ServiceAvailability entity);

    ServiceAvailabilityResponse toResponse(ServiceAvailability entity);

    List<ServiceAvailabilityResponse> toResponseList(List<ServiceAvailability> entities);
}
