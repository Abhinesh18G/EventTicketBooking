package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EventTicketBookingTest {

    @Test
    public void testRegularTicket() {
        assertEquals(1500,
                EventTicketBooking.calculatePrice("Regular", 3));
    }

    @Test
    public void testPremiumTicket() {
        assertEquals(4000,
                EventTicketBooking.calculatePrice("Premium", 4));
    }

    @Test
    public void testVIPTicket() {
        assertEquals(7500,
                EventTicketBooking.calculatePrice("VIP", 5));
    }

    @Test
    public void testVIPWithDiscount() {
        assertEquals(8100,
                EventTicketBooking.calculatePrice("VIP", 6));
    }

    @Test
    public void testInvalidCategory() {
        assertEquals(-1,
                EventTicketBooking.calculatePrice("Gold", 2));
    }
}
