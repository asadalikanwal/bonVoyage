package com.bonvoyage.controller;

import com.bonvoyage.domain.Car;
import com.bonvoyage.domain.Driver;

import com.bonvoyage.service.CarService;
import com.bonvoyage.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class DriverController {

    @Autowired
    DriverService driverService;

    @Autowired
    CarService carService;



//    @RequestMapping(value = "/registerCar", method = RequestMethod.GET)
//    public String registerCar(@ModelAttribute("newCar") Car newCar){
//
//        return "carRegistration";
//    }
//
//    @RequestMapping(value = "/registerCar", method = RequestMethod.POST)
//    public String saveCar(@Valid @ModelAttribute("newCar") Car newCar, BindingResult result, RedirectAttributes redirectAttributes){
//        if(result.hasErrors()){
//            return "carRegistration";
//        }
//        redirectAttributes.addFlashAttribute("newCar",newCar);
//        return "redirect:registerDriver";
//    }

    @RequestMapping(value = "/registerDriver", method = RequestMethod.GET)
    public String registerDriver(@ModelAttribute("newDriver") Driver newDriver){

        return "driverRegistration";
    }

    @RequestMapping(value = "/registerDriver", method = RequestMethod.POST)
    public String saveDriver(@Valid @ModelAttribute("newDriver") Driver newDriver, BindingResult result, RedirectAttributes redirectAttributes){
        if(result.hasErrors()){
            return "driverRegistration";
        }
        driverService.save(newDriver);
        redirectAttributes.addFlashAttribute("newDriver",newDriver);
        return "redirect:driverRegistered";
    }

    @RequestMapping(value = "/driverRegistered", method = RequestMethod.GET)
    public String showSuccessRegistration(){

        return "driverRegistered";
    }


}
