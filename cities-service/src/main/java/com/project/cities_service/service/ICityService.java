package com.project.cities_service.service;

import com.project.cities_service.dto.CityDTO;

public interface ICityService {

    public CityDTO getCitiesHotels(String name, String country);
}
