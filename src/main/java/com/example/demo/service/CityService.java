package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.City;
import com.example.demo.repository.CityRepository;

@Service
public class CityService implements ICityService {

	@Autowired
	private CityRepository repository;
	
	@Override
	public List<City> findAllOrderedByNameDescending() {
		List<City> cities = (List<City>) repository.findAllOrderedByNameDescending();
		return cities;
	}
	
	
	
	@Override
	public List<City> saveAllCity(List<City> cities) {
		List<City> cities1 = (List<City>) repository.saveAll(cities);
		return cities1;
	}

	@Override
	public City save(City city) {
		City savedCity = repository.save(city);
		return savedCity;
	}
	
	@Override
	public City findAllByProductName(String cityName) {
		City fetchCity = repository.findAllByProductName(cityName);
		return fetchCity;
	}

}
