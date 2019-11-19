package com.bonvoyage.service;

import com.bonvoyage.domain.User;
import com.bonvoyage.domain.UserRole;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> findUsersByRole(UserRole userRole);

    int countOfUsername(String username);

    User findUserByUsername(String username);
}
