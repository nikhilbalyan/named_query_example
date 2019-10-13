package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.City;
import com.example.demo.service.ICityService;

@RestController
public class MyController {

	@Autowired
	private ICityService cityService;
	
//	@GetMapping("/showCities")
	@RequestMapping(value = "/showCities", method = RequestMethod.GET)
	public List<City> findAllOrderedByNameDescending() {
		List<City> cities = (List<City>) cityService.findAllOrderedByNameDescending();
		return cities;
	}
	
//	@PostMapping("/addSingleCity")
	@RequestMapping(value = "/addSingleCity", method = RequestMethod.POST)
	public City saveSingleCity(@RequestBody City city) {
		City cities =  cityService.save(city);
		return cities;
	}
	
}
