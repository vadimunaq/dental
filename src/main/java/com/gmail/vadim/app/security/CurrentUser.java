package com.gmail.vadim.app.security;

import com.gmail.vadim.backend.data.entity.User;

@FunctionalInterface
public interface CurrentUser {

	User getUser();
}
