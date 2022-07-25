package com.invoiceservice;

public class InvoiceGenerator {
    private static final double MINIMUM_COST_PER_KM = 10.00;
    private static final int COST_PER_TIME = 1;

    public double calculatFair(double distance, int time) {
        return distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
    }
}
