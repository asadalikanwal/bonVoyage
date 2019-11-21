package com.bonvoyage.controller;

import com.bonvoyage.domain.User;
import com.bonvoyage.domain.UserRole;
import com.bonvoyage.exception.UserNotFoundException;
import com.bonvoyage.repository.UserRepository;
import com.bonvoyage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/rest")
public class AdminRestController {
    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/updateUser/{userId}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public User addItem(@PathVariable String userId) {
        System.out.println("User Update from Admin controller ________");
        Long id = Long.parseLong(userId);
        User user = userService.findUserById(id);
        if(user == null) {
            throw new IllegalArgumentException(new UserNotFoundException(userId, null));
        }
        System.out.println("Got the user _____________ : " + user.getUserRole());
        user.setUserRole(UserRole.RIDER);
        System.out.println("Got the user _____________ : " + user.getUserRole());
        userService.saveUser(user);
        return user;
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST,  reason="Illegal request, please verify your payload")
    public void handleClientErrors(Exception ex) { }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason="Internal server error")
    public void handleServerErrors(Exception ex) {	}
}
