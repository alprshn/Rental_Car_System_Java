/**

@file PaymentSystemService.java
@brief This file contains the implementation of the PaymentSystemService class.
The PaymentSystemService class is a part of the CE204_HW4_Library package and provides methods for processing car rental payments.
*/
package ce204_hw4_library;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @class PaymentSystemService
 * 
 * @brief Represents a payment system service for car rentals.
 * 
 *        The PaymentSystemService class provides methods for processing car
 *        rental payments using different payment strategies.
 * 
 *        It manages the payment process and keeps track of the total money
 *        available for each car rental.
 */
public class PaymentSystemService {
	private List<Integer> money = new ArrayList<>();
	private int carIndex;
	private CarPaymentStrategyPattern strategyPattern;

	/**
	 * 
	 * @brief Processes the car rental order. This method processes the car rental
	 *        order by collecting the payment system details and performing the
	 *        payment using the selected payment strategy. It checks if payment
	 *        details are available before making the payment.
	 */
	public void proccessOrder() {
		strategyPattern.CollectPaymentSystemDetails();
		if (strategyPattern.PaymentDetails()) {
			strategyPattern.PaySystem(getTotalMoney());
		}

	}

	/**
	 * 
	 * @brief Sets the amount of money for a car rental. This method sets the amount
	 *        of money for a car rental by adding it to the list of money amounts.
	 * @param costInput The amount of money for the car rental.
	 */
	public void setMoney(int costInput) {
		money.add(costInput);
	}

	/**
	 * 
	 * @brief Removes the amount of money for a car rental. This method removes the
	 *        amount of money for a car rental from the list of money amounts.
	 * @param costInput The amount of money to be removed.
	 */
	public void removeMoney(int costInput) {
		money.remove(costInput);

	}

	/**
	 * 
	 * @brief Retrieves the total amount of money for the selected car rental. This
	 *        method retrieves the total amount of money for the selected car rental
	 *        based on the car index.
	 * @return The total amount of money for the selected car rental.
	 */
	public int getTotalMoney() {
		return money.get(carIndex);
	}

	/**
	 * 
	 * @brief Sets the index of the selected car. This method sets the index of the
	 *        selected car in the carIndex variable.
	 * @param carIndexInput The index of the selected car.
	 */
	public void setSelectedCarIndex(int carIndexInput) {

		carIndex = carIndexInput;

	}

	/**
	 * 
	 * @brief Sets the payment strategy pattern. This method sets the payment
	 *        strategy pattern to be used for the car rental payment.
	 * @param strategyPatternSelected The selected payment strategy pattern.
	 */
	public void setStrategyPattern(CarPaymentStrategyPattern strategyPatternSelected) {
		strategyPattern = strategyPatternSelected;
	}

	/**
	 * 
	 * @brief Retrieves the list of money amounts. This method retrieves the list of
	 *        money amounts.
	 * @return The list of money amounts.
	 */
	public List<Integer> getMoney() {
		return money;
	}
}
