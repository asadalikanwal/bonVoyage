package com.bonvoyage.controller;

import com.bonvoyage.domain.User;
import com.bonvoyage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @GetMapping(value="/login")
public String showLogin(){
        return "login";
    }

    @PostMapping(value="/postlogin")
    public String doLogin(String username, String password) {
        if(userService.isCurrentUser(username, password))
            return"../welcome";
        return "login";
    }
}
