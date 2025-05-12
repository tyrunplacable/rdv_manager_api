package payload.request;

public record UpdateServiceRequest(
    String name,
    String description,
    String timezone
) {}

