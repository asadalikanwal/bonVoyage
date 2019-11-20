package com.bonvoyage.service.impl;

import com.bonvoyage.domain.User;
import com.bonvoyage.domain.UserRole;
import com.bonvoyage.repository.UserRepository;
import com.bonvoyage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>)userRepository.findAll();
    }

    @Override
    public List<User> findUsersByRole(UserRole userRole) {
        String role = userRole.toString();
        return userRepository.findUsersByRole(userRole);
    }

    @Override
    public boolean usernameExists(String username) {
        return findUserByUsername(username)!=null;
    }

    public User findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    @Override
    public boolean isCurrentUser(String username, String password) {
        return userRepository.isCurrentUser(username, password) == 1;
    }
}
