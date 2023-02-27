package com.demo.service.guestService.repo;

import com.demo.service.guestService.model.Guest;

import java.util.Arrays;
import java.util.List;

public class InMemoryGuestDB {

    public static List<Guest> getGuests() {
        Guest guest1 = new Guest("1", "John", "DL", true, "1626");
        Guest guest2 = new Guest("2", "Mike", "Passport", true, "1627");
        Guest guest3 = new Guest("3", "Harvey", "DL", true, "1628");
        Guest guest4 = new Guest("4", "Barry", "DL", true, "1629");

        return Arrays.asList(guest1, guest2, guest3, guest4);
    }
}
