package com.bonvoyage.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.bonvoyage.domain.Trip;
import com.bonvoyage.service.TripService;



/*
 * The Trip Conroller Handle All the Task for the Trip.
 * @author  John Styves Vallon
 * @version 1.0
 * @since   2019-11-18
 *
 * */


@Controller
public class TripController {


    @Autowired
    TripService tripService;

    /**
     * Serve the Seach Page
     * GET Method
     */

    /**
     * Serve the map page Get Method
     */


    @RequestMapping(value = "/addTrip", method = RequestMethod.GET)
    public String home(@ModelAttribute("newTrip") Trip trip) {
        System.out.println("_______ INSIDE /addTrip GET _______");

        return "/map";
    }


    /**
     * Serve the map page
     */
//	  @RequestMapping(value = "/addTrip", method = RequestMethod.POST)
//	  public String map(@Valid @ModelAttribute("newTrip") Trip newTrip, BindingResult BindResult) {
//		  
//		
//		  System.out.println("Start "+newTrip.getorigin());
//		  System.out.println("End  "+newTrip.getdestination());
//		  System.out.println("Start Date "+newTrip.getoriginDate());
//		  
//		  
//		  System.out.println("End Date  "+newTrip.getdestinationDate());
//		  System.out.println("Number of People "+newTrip.getNumberPeople());
//		  System.out.println("Fee Type of People "+newTrip.getPaymentType());
//		  
//		  
//		  
//		  System.out.println("Orignin Lat  "+newTrip.getOriginLat());
//		  System.out.println("Orignin Lng "+newTrip.getOriginLng());
//		  System.out.println("Destination Lat  "+newTrip.getDestinationLat());
//		  System.out.println("Destination Lng "+newTrip.getDestinationLng());
//		  
//		  System.out.println("Get Fee of People "+newTrip.getFees());
//		  
//		  if(BindResult.hasErrors()) {
//			  return "/map";
//		  }
//		  
//		 //tripService.saveTripe(newTrip);
//		  
//		  
//		  
//
//	      return "redirect:/seachTrip";
//	  }
//	  
    @RequestMapping(value = "/addTrip", method = RequestMethod.POST)
    public String map(@ModelAttribute("newTrip") Trip newTrip) {
		System.out.println("_______ INSIDE /addTrip POST _______");
        System.out.println("Start " + newTrip.getorigin());
        System.out.println("End  " + newTrip.getdestination());
        System.out.println("Start Date " + newTrip.getoriginDate());


        System.out.println("End Date  " + newTrip.getdestinationDate());
        System.out.println("Number of People " + newTrip.getNumberPeople());
        System.out.println("Fee Type " + newTrip.getPaymentType());


        System.out.println("Orignin Lat  " + newTrip.getOriginLat());
        System.out.println("Orignin Lng " + newTrip.getOriginLng());
        System.out.println("Destination Lat  " + newTrip.getDestinationLat());
        System.out.println("Destination Lng " + newTrip.getDestinationLng());

        System.out.println("Get Fee of People " + newTrip.getFees());


        tripService.saveTripe(newTrip);

        return "redirect:/searchTrip";
    }


    @RequestMapping(value = "/searchTrip", method = RequestMethod.GET)
    public String search() {
		System.out.println("______ AFTER REDIRECTION, now in /searchTrip controller _______");
        return "/search";
    }


}
