package com.example.demo.service;

import java.util.List;

import com.example.demo.model.City;

public interface ICityService {
	List<City> findAllOrderedByNameDescending();

	List<City> saveAllCity(List<City> cities);
	
	City save(City city);
}
