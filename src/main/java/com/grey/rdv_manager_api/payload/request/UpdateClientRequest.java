package com.grey.rdv_manager_api.payload.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import java.util.Set;

public record UpdateClientRequest(
    String firstName,
    String lastName,
    @Email String email,
    @Pattern(regexp = "^[0-9+\\s-]{6,20}$") String phone,
    String password, // assume optional update
    Set<String> roles // must match enum values
) {}

