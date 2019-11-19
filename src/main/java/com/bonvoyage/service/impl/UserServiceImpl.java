package com.bonvoyage.service.impl;

import com.bonvoyage.domain.User;
import com.bonvoyage.domain.UserRole;
import com.bonvoyage.repository.UserRepository;
import com.bonvoyage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findUsersByRole(UserRole userRole) {
        String role = userRole.toString();
        return userRepository.findUsersByRole(userRole);
    }
}
