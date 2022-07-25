package com.invoiceservice;

public class InvoiceGenerator {
    private static final double MINIMUM_COST_PER_KM = 10.00;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_FARE = 5.0;

    public double calculatFair(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
        return Math.max(totalFare, MINIMUM_FARE);
    }

    public InvoiceSummary calculatFair(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride:rides){
            totalFare += this.calculatFair(ride.distance, ride.time);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }
}
