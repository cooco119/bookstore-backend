package com.cooco119.bookstore.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
    GUEST("ROLE_GUEST", "Guest"),
    USER("ROLE_USER", "user");

    private final String key;
    private final String title;
}
