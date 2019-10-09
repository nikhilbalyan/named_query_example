package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.City;
import com.example.demo.service.ICityService;

@Controller
public class MyController {

	@Autowired
	private ICityService cityService;
	
	@GetMapping("/showCities")
	public List<City> findAllOrderedByNameDescending() {
		List<City> cities = (List<City>) cityService.findAllOrderedByNameDescending();
		return cities;
	}
	
	@PostMapping("/addAllCities")
	public List<City> saveAllCities(List<City> city) {
		List<City> cities = (List<City>) cityService.saveAllCity(city);
		return cities;
	}
	
}
