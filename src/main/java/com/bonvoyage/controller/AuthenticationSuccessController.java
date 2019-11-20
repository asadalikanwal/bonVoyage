package com.bonvoyage.controller;

import com.bonvoyage.domain.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AuthenticationSuccessController implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest,
                                        HttpServletResponse httpServletResponse,
                                        Authentication authentication) throws IOException, ServletException {
        // Set session variables to hold current user's data
        HttpSession session = httpServletRequest.getSession();
        User loggedInUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        session.setAttribute("username", loggedInUser.getFirstName() + ' ' + loggedInUser.getLastName());
        session.setAttribute("role", loggedInUser.getUserRole());

        //set our response to OK status
        httpServletResponse.setStatus(HttpServletResponse.SC_OK);

        //Redirect the user after successfully login
        httpServletResponse.sendRedirect("../welcome");
    }
}
