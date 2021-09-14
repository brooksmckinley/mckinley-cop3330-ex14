/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testWITaxReport() {
        String expected = "The subtotal is $10.00.\n" +
                "The tax is $0.55.\n" +
                "The total is $10.55.";
        String actual = App.getTotalReport(10, "WI");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNonWITaxReport() {
        String expected = "The total is $10.00.";
        String actual = App.getTotalReport(10, "FL");
        Assertions.assertEquals(expected, actual);
    }
}