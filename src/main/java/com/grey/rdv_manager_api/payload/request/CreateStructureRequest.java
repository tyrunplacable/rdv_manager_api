package com.grey.rdv_manager_api.payload.request;

import jakarta.validation.constraints.*;


public record CreateStructureRequest(
@NotBlank(message = "Name is required") String name,
        String description,
@NotBlank(message = "Address is required") String address,
@NotBlank(message = "Phone is required") @Pattern(regexp = "\\+?[0-9.-]{7,15}", message = "Invalid phone format") String phone,
@NotBlank @Email(message = "Invalid email") String email,
@NotBlank(message = "Timezone is required") String timezone
        ){}
