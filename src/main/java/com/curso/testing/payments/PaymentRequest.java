package com.curso.testing.payments;

/**
 * System:                 CleanBnB
 * Name:                   PaymentRequest
 * Description:            Class that represents a PaymentRequest's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/9/21
 */
public class PaymentRequest {

    private double amount;

    public PaymentRequest(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
