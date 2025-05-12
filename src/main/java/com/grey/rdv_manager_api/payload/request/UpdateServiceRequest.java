package com.grey.rdv_manager_api.payload.request;

public record UpdateServiceRequest(
    String name,
    String description,
    String timezone
) {}

