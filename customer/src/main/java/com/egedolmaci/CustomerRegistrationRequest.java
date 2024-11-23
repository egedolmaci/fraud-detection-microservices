package com.egedolmaci;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
