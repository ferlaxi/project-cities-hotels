package com.project.cities_service.controller;

import com.project.cities_service.dto.CityDTO;
import com.project.cities_service.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CitiesController {

    @Autowired
    private ICityService cityServ;

    @GetMapping("/hotels")
    public CityDTO getCityAndHotels(@RequestParam("name") String name,
                                    @RequestParam("country") String country) {
        return cityServ.getCitiesHotels(name, country);
    }
}
