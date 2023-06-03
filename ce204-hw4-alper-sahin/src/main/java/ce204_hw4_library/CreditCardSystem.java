/**

@file CreditCardSystem.java
@brief This file contains the implementation of the CreditCardSystem class.
*/
package ce204_hw4_library;

/**
 * 
 * @class CreditCardSystem
 * 
 * @brief Represents the credit card payment system.
 */
public class CreditCardSystem {
	private String cardNumberSystem;
	private String Date;
	private String cvvSystem;

	/**
	 * 
	 * @brief Constructs a CreditCardSystem object.
	 * @param cardNumberInput The credit card number.
	 * @param expiryDateInput The expiry date of the credit card.
	 * @param cvvInput        The CVV code of the credit card.
	 */
	public CreditCardSystem(String cardNumberInput, String expiryDateInput, String cvvInput) {
		// TODO Auto-generated constructor stub
		cardNumberSystem = cardNumberInput;
		Date = expiryDateInput;
		cvvSystem = cvvInput;
	}

	/**
	 * 
	 * @brief Retrieves the expiry date of the credit card.
	 * @return The expiry date.
	 */
	public String getDate() {
		return Date;
	}

	/**
	 * 
	 * @brief Retrieves the CVV code of the credit card.
	 * @return The CVV code.
	 */
	public String getCvvSystem() {
		return cvvSystem;
	}

	/**
	 * 
	 * @brief Retrieves the credit card number.
	 * @return The credit card number.
	 */
	public String getCardNumberSystem() {
		return cardNumberSystem;
	}
}
