package com.demo.service.guestService.controller;

import com.demo.service.guestService.model.Property;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "airbnbService")
public interface AirbnbProxy {

    @GetMapping("/property")
    public List<Property> getProperties();

}
