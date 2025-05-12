package mapper;

import domain.model.Client;
import payload.request.CreateClientRequest;
import payload.request.UpdateClientRequest;
import payload.response.ClientResponse;

import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    @Mapping(target = "passwordHash", ignore = true)
    Client toEntity(CreateClientRequest dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "passwordHash", ignore = true)
    Client updateEntity(UpdateClientRequest dto, @MappingTarget Client entity);

    ClientResponse toResponse(Client entity);

    List<ClientResponse> toResponseList(List<Client> entities);
}

