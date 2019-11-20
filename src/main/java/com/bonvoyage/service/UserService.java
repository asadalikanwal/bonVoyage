package com.bonvoyage.service;

import com.bonvoyage.domain.User;
import com.bonvoyage.domain.UserRole;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    List<User> findUsersByRole(UserRole userRole);

    boolean usernameExists(String username);

    User findUserByUsername(String username);

    boolean isCurrentUser(String username, String password);
}
