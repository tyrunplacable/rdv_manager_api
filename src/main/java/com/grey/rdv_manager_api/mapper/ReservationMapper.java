package com.grey.rdv_manager_api.mapper;

import org.mapstruct.*;

import com.grey.rdv_manager_api.domain.model.Reservation;
import com.grey.rdv_manager_api.payload.request.CreateReservationRequest;
import com.grey.rdv_manager_api.payload.request.UpdateReservationRequest;
import com.grey.rdv_manager_api.payload.response.ReservationResponse;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReservationMapper {

    Reservation toEntity(CreateReservationRequest dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Reservation updateEntity(UpdateReservationRequest dto, @MappingTarget Reservation entity);

    ReservationResponse toResponse(Reservation entity);

    List<ReservationResponse> toResponseList(List<Reservation> entities);
}
