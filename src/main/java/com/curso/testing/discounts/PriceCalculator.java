package com.curso.testing.discounts;

/**
 * System:                 CleanBnB
 * Name:                   PriceCalculator
 * Description:            Class that represents a PriceCalculator's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/9/21
 */
public class PriceCalculator {

    private List<Double> prices = new ArrayList<>();
    private double discount = 0;

    public double getTotal() {

        double result = 0;

        for (Double price : prices) {
            result += price;
        }

        return result * ((100 - discount) / 100);
    }

    public void addPrice(double price) {
        prices.add(price);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
