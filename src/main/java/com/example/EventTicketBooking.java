package com.example;

import java.util.Scanner;

public class EventTicketBooking {

    public static double calculatePrice(String category, int tickets) {

        double price;

        if (category.equalsIgnoreCase("Regular")) {
            price = 500;
        } 
        else if (category.equalsIgnoreCase("Premium")) {
            price = 1000;
        } 
        else if (category.equalsIgnoreCase("VIP")) {
            price = 1500;
        } 
        else {
            return -1;
        }

        double total = price * tickets;

        // 10% discount for more than 5 tickets
        if (tickets > 5) {
            total = total - (total * 0.10);
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter category (Regular/Premium/VIP): ");
        String category = sc.nextLine();

        double total = calculatePrice(category, tickets);

        if (total == -1) {
            System.out.println("Invalid category");
        } 
        else {
            System.out.println();
            System.out.println("----- Booking Details -----");
            System.out.println("Customer Name: " + name);
            System.out.println("Number of Tickets: " + tickets);
            System.out.println("Category: " + category);
            System.out.println("Total Price: Rs." + total);
        }

        sc.close();
    }
}
