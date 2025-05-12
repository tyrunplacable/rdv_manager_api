package payload.request;

import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

public record CreateClientRequest(
@NotBlank String firstName,
@NotBlank String lastName,
@NotBlank @Email String email,
@Pattern(regexp = "\\+?[0-9.-]{7,15}") String phone,
@NotBlank @Size(min = 8, message = "Password must be at least 8 characters") String password,
@NotEmpty List<String> roles,
        UUID structureId
        ){}
