package payload.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

public record UpdateStructureRequest(
    String name,
    String description,
    String address,
    @Pattern(regexp = "^[0-9+\\s-]{6,20}$") String phone,
    @Email String email,
    String timezone
) {}
