
/**

@file PayPayPal.java
@brief This file contains the implementation of the PayPayPal class.
The PayPayPal class is a part of the CE204_HW4_Library package and implements the CarPaymentStrategyPattern interface.
It provides methods for handling PayPal payments for car rentals.
*/
package ce204_hw4_library;

public class PayPayPal implements CarPaymentStrategyPattern {
	/**
	 * 
	 * @class PayPayPal
	 * 
	 * @brief Represents a PayPal payment strategy for car rentals.
	 * 
	 *        The PayPayPal class implements the CarPaymentStrategyPattern interface
	 *        and provides methods for handling PayPal
	 * 
	 *        payments for car rentals. It allows users to pay for their car rental
	 *        using a PayPal account.
	 */
	private PayPalSystem payPal;
	private int totalMoney = 10000;

	/**
	 * 
	 * @brief Retrieves the payment details. This method retrieves the payment
	 *        details for the PayPal payment strategy.
	 * @return true, indicating that payment details are available.
	 */
	@Override
	public boolean PaymentDetails() {
		return true;
	}

	/**
	 * 
	 * @brief Performs the PayPal payment. This method performs the PayPal payment
	 *        for the car rental.
	 * @param price The amount of money used for the payment.
	 */
	@Override
	public void PaySystem(int price) {
		System.out.println("Paying " + price + " using Credit Card.");
		setMoney(getMoney() - price);
		System.out.println(getMoney() + " remanined in the card.");
		System.out.println("You rented the car");
	}

	/**
	 * 
	 * @brief Collects the payment system details. This method collects the
	 *        necessary details for the PayPal payment system.
	 */
	@Override
	public void CollectPaymentSystemDetails() {
		payPal = new PayPalSystem("abc@gmail.com", "password123");

	}

	/**
	 * 
	 * @brief Retrieves the total amount of money available in the PayPal account.
	 *        This method retrieves the total amount of money available in the
	 *        PayPal account.
	 * @return The total amount of money available in the PayPal account.
	 */
	public int getMoney() {
		return totalMoney;
	}

	/**
	 * 
	 * @brief Sets the total amount of money available in the PayPal account. This
	 *        method sets the total amount of money available in the PayPal account.
	 * @param i The total amount of money to be set in the PayPal account.
	 */
	public void setMoney(int i) {
		// TODO Auto-generated method stub
		totalMoney = i;
	}

	/**
	 * 
	 * @brief Retrieves the PayPal system. This method retrieves the PayPal system.
	 * @return The PayPal system.
	 */
	public PayPalSystem getPayPalCard() {
		return payPal;
	}
}
