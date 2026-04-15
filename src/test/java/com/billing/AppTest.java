package com.billing;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testBillCalculation() {
        assertEquals(150.0, App.calculateBill(100), 0.1);
        assertEquals(400.0, App.calculateBill(200), 0.1);
    }
}