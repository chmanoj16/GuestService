package com.demo.service.guestService.controller;

import com.demo.service.guestService.model.Guest;
import com.demo.service.guestService.model.Property;
import com.demo.service.guestService.repo.InMemoryGuestDB;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController()
public class GuestController {

    @Autowired
    AirbnbProxy airbnbProxy;

    @GetMapping("/guest/{id}")
    public Guest getGuest(@PathVariable String id) {
        for (Guest guest : InMemoryGuestDB.getGuests()) {
            if (guest.getGuestId().equals(id))
                return guest;
        }
        throw new RuntimeException("No Guest Found for the provided Id:" + id);
    }

    @GetMapping("/guest")
    public List<Guest> getAllGuests() {
        return InMemoryGuestDB.getGuests();
    }

    @GetMapping("/guest/property")
//    @Retry(name = "default", fallbackMethod = "defaultProperties")
//    @CircuitBreaker(name = "default", fallbackMethod = "defaultProperties")
    @RateLimiter(name = "default")
    public List<Property> getProperties() {
        System.out.println("Fetching Properties from airbnbservice");
        return airbnbProxy.getProperties();
    }

    public List<Property> defaultProperties(Exception exception) {
        Property property = new Property("0", "default", "default", "default", "default");
        return Collections.singletonList(property);
    }
}
