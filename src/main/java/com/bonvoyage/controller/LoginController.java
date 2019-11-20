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
public class LoginController implements AuthenticationSuccessHandler {
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

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest,
                                        HttpServletResponse httpServletResponse,
                                        Authentication authentication) throws IOException, ServletException {
        // Set session variables to hold current user's data
        HttpSession session = httpServletRequest.getSession();
        User loggedInUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        session.setAttribute("username", loggedInUser.getUsername());
        session.setAttribute("role", loggedInUser.getUserRole());

        //set our response to OK status
        httpServletResponse.setStatus(HttpServletResponse.SC_OK);

        //Redirect the user after successfully login
        httpServletResponse.sendRedirect("../welcome");
    }
}
