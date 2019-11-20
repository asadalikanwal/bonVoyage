package com.bonvoyage.controller;

import com.bonvoyage.domain.User;
import com.bonvoyage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @GetMapping(value="/login")
public String showLogin(){
        return "/login";
    }

//    @PostMapping(value="/postlogin")
//    public boolean doLogin(String username, String password) {
//        System.out.println(username + " " + password);
//        return true;
//        return !userService.isCurrentUser(username, password);
//            return"redirect:/welcome";
//        return "/login";
//    }
}
