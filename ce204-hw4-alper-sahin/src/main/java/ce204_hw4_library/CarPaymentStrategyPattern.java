/**

@file CarPaymentStrategyPattern.java
@brief This file contains the declaration of the CarPaymentStrategyPattern interface.
*/
package ce204_hw4_library;

/**
 *
 * @interface CarPaymentStrategyPattern
 *
 * @brief Represents the payment strategy pattern for car rental.
 */
public interface CarPaymentStrategyPattern {
  /**
   *
   * @brief Verifies the payment details.
   * @retval [boolean] True if the payment details are valid, false otherwise.
   */
  boolean PaymentDetails();

  /**
   *
   * @brief Performs the payment using the specified price.
   * @param price The price of the car rental.
   */
  void PaySystem(int price);

  /**
   *
   * @brief Collects the payment system details from the user.
   */
  void CollectPaymentSystemDetails();

}