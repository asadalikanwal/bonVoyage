package com.bonvoyage.controller;

import com.bonvoyage.domain.User;
import com.bonvoyage.domain.UserRole;
import com.bonvoyage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/signup")
    public String startSignupProcess(@ModelAttribute("newUser") User user) {
        return "signup";
    }

    @PostMapping(value = "/signup")
    public String createUser(@Valid @ModelAttribute("newUser") User userToCreate, BindingResult result, RedirectAttributes redirectAttributes) {
    if (result.hasErrors())
        return "signup";
    // Create new user and assign it to the model in the same time
    redirectAttributes.addFlashAttribute("savedUser", userService.saveUser(userToCreate));
    return "redirect:/success";
    }

    @GetMapping(value="/success")
    public String showCreatedUser() {
        return "userDetails";
    }

    @GetMapping(value="/updateUser/{username}")
    public String updateUserData(@PathVariable("username")String userName, User user, Model model) {
        model.addAttribute("userToUpdate", userService.findUserByUsername(userName));
        return "updateUser";
    }

    @PutMapping(value="/updateUser/{username}")
    public String updateUserData(@Valid @PathVariable("username")String userName, @ModelAttribute("userToUpdate")User user,
                                 BindingResult result, RedirectAttributes redirectAttributes) {
        if (result.hasErrors())
            return "updateUser";
        userService.saveUser(user);
        redirectAttributes.addFlashAttribute("savedUser");
        return "redirect:/success";
    }

    @GetMapping(value="/nonApproved")
    public String getNonApprovedUsers(Model model) {
        model.addAttribute("listOfUsers", userService.findUsersByRole(UserRole.NONE));
        return "awaitingApproval";
    }
}
