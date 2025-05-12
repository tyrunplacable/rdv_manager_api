package mapper;

import domain.model.Reservation;
import payload.request.CreateReservationRequest;
import payload.request.UpdateReservationRequest;
import payload.response.ReservationResponse;

import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReservationMapper {

    Reservation toEntity(CreateReservationRequest dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Reservation updateEntity(UpdateReservationRequest dto, @MappingTarget Reservation entity);

    ReservationResponse toResponse(Reservation entity);

    List<ReservationResponse> toResponseList(List<Reservation> entities);
}
