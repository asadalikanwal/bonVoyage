package com.bonvoyage.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.bonvoyage.domain.Search;
import com.bonvoyage.domain.Trip;
import com.bonvoyage.service.TripService;



@Controller
public class HomeController {


	@Autowired
	private TripService tripService;

//  	@ModelAttribute("listLastTentrip")
//
//  	public List<Trip> getList(){
//  	  return tripService.lastTenTrip();
//  	}


	@RequestMapping({"/","/welcome"})
	public String welcome(@ModelAttribute("searchTrip") Search search, Model model) {

		ObjectMapper mapper = new ObjectMapper();

		List<Trip> listTrip = new ArrayList<Trip>();
		Trip one   = new Trip();
		Trip one2  = new Trip();
		Trip one3  = new Trip();


		one.setDestinationLat(151.274856);
		one.setDestinationLng(-33.890542);



		one2.setDestinationLat(151.259052);
		one2.setDestinationLng(-33.923036);


		one3.setDestinationLat(151.157507);
		one3.setDestinationLng(-34.028249);

		listTrip.add(one);
		listTrip.add(one2);
		listTrip.add(one3);

		String trips = null;

		try {
			trips = mapper.writeValueAsString( listTrip);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		model.addAttribute("listLastTentrip",trips);

		return "/welcome";
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(@ModelAttribute("searchTrip") Search search,Model model) {
		return "search";
	}

	@RequestMapping(value="/search_Trip", method = RequestMethod.POST)
	public String search(@Valid @ModelAttribute("searchTrip") Search search, BindingResult bindingResult, RedirectAttributes redirectAttributes,Model model) {

		if(bindingResult.hasErrors()) {
			return "/welcome";
		}

		System.out.println("Origin "+search.getOrigin_search());
		System.out.println("Destination "+search.getDestination_search());
		return "redirect:/search";
	}




}