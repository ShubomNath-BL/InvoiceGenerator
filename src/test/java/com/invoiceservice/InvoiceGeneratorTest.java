package com.invoiceservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InvoiceGeneratorTest {
    InvoiceGenerator invoiceGenerator= null;
    @BeforeEach
    public void setUp() {
        invoiceGenerator=new InvoiceGenerator();
    }

    @Test
    void givenDistanceAndTime_ShouldReturnTotalFair() {
        double distance=2.0;
        int time=5;
        double fare = invoiceGenerator.calculatFair(distance,time);
        Assertions.assertEquals(25, fare, 0.0);
    }

    @Test
    void givenLessDistanceAndTime_ShouldReturnMinimumFair() {
        double distance=0.1;
        int time=1;
        double fare = invoiceGenerator.calculatFair(distance,time);
        Assertions.assertEquals(5, fare, 0.0);
    }

    @Test
    void givenMultipleRides_ShouldReturnInvoiceSummary() {
        Ride[] rides = {new Ride(2.0, 5),
                        new Ride(0.1, 1)
                        };
        InvoiceSummary summary = invoiceGenerator.calculatFair(rides);
        InvoiceSummary expectedInvoiceSummary= new InvoiceSummary(2,30.0);
        Assertions.assertEquals(expectedInvoiceSummary, summary);
    }
}
