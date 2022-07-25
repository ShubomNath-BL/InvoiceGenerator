package com.invoiceservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceGeneratorTest {
    @Test
    void givenDistanceAndTime_ShouldReturnTotalFair() {
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        double distance=2.0;
        int time=5;
        double fare = invoiceGenerator.calculatFair(distance,time);
        Assertions.assertEquals(25, fare, 0.0);
    }
}
