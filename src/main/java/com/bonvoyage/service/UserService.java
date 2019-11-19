package com.bonvoyage.service;

import com.bonvoyage.domain.User;
import com.bonvoyage.domain.UserRole;

import java.util.List;

public interface UserService {
    User createUser(User user);

    List<User> findUsersByRole(UserRole userRole);
}
