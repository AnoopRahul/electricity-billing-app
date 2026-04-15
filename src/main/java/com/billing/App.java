package com.billing;

public class App {

    public static void main(String[] args) {

        int units = 120;

        while (true) {
            double bill = calculateBill(units);

            System.out.println("Electricity Units: " + units);
            System.out.println("Total Bill: ₹ " + bill);
            System.out.println("-----------------------------");

            try {
                Thread.sleep(10000); // 10 seconds delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static double calculateBill(int units) {

        if (units <= 100) {
            return units * 1.5;
        } 
        else if (units <= 200) {
            return (100 * 1.5) + (units - 100) * 2.5;
        } 
        else {
            return (100 * 1.5) + (100 * 2.5) + (units - 200) * 4;
        }
    }
}