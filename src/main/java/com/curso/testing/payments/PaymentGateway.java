package com.curso.testing.payments;

/**
 * System:                 CleanBnB
 * Name:                   PaymentGateway
 * Description:            Class that represents a PaymentGateway's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/9/21
 */
public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
