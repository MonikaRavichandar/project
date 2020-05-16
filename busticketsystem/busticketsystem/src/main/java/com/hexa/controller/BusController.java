package com.hexa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hexa.dao.BusRepository;
import com.hexa.model.Bus;

//@Controller
@CrossOrigin(origins = "http://localhost:9292")
@RestController
@RequestMapping("/api")
 public class BusController {
	
	@Autowired
	BusRepository br;
	@RequestMapping("/")
	public String home(){
		System.out.println("WE ARE IN CONTROLLER SECTION");
		return "index.jsp";
	}
	@RequestMapping("/insert")
	public String addBus(Bus bus){
		System.out.println("Bus id of the bus : "+bus.getBusId());
		System.out.println("Bus Name :"+bus.getBusPName());
		System.out.println("Starting Location of the bus :"+bus.getBusLocation());
		System.out.println("Destination of the bus :"+bus.getBusDestination());
		System.out.println("Ticket price :"+bus.getBusPrice());
		br.save(bus);
		return "index.jsp";
	}
@RequestMapping("/obtain")
public ModelAndView getBusData(@RequestParam("busId") int busId){
	ModelAndView mv = new ModelAndView("display.jsp");
	Bus bus = br.findById(busId).orElse(new Bus());
	System.out.println("DESTINATION  DETAIL IS:" + bus);
	System.out.println("LIST OF BUS:"+ br.findAll());
	System.out.println("DESTINATION :"+ br.findByBusDestination("Erode"));
	System.out.println("BUS STARTING LOCATION:"+ br.findByBusLocation("Chennai"));
	System.out.println("BUS DETAIL IN A SORTED MANNER BASED ON ID:" + br.findBySortedBusDestination(2));
	mv.addObject("b", bus);
	return mv;
}

// RESTFUL WEB-SERVICES
// DISPLAY ALL THE BUS DETAILS
@RequestMapping("/retrieve")
@ResponseBody
public List<Bus> displayBusDetail(){
	return (List<Bus>) br.findAll();
}

// DISPLAY BUS BASED ON id
@RequestMapping("/getbyId/{busId}")
@ResponseBody
public Optional<Bus> displayBusDestinationBy(@PathVariable("busId") int busId){
	return br.findById(busId);
}

// INSERTING BuS
@PostMapping("/bus/create")
public Bus insertBus(@RequestBody Bus bus){
    br.save(bus);
    return bus;
}

//UPDATING BUs DETAIL
@PutMapping("/updatebus")
public String updateBus(@RequestBody Bus bus){
	br.save(bus);
	return bus.getBusDestination();
}

// REMOVING Bus BASED ON bus id
@DeleteMapping("/removebus/{busId}")
public void deleteBusById(@PathVariable("busId") int busId){
	br.deleteById(busId);
}



	
}
