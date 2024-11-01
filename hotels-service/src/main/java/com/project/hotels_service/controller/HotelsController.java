package com.project.hotels_service.controller;

import com.project.hotels_service.model.Hotel;
import com.project.hotels_service.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelsController {

    @Autowired
    private IHotelService hotelServ;

    @GetMapping("/{city_id}")
    public List<Hotel> getHotelsByCityId (@PathVariable("city_id") Long city_id) {
        return hotelServ.getHotelsByCityId(city_id);
    }
}