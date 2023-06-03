/**

@file PayCash.java
@brief This file contains the implementation of the PayCash class.
*/
package ce204_hw4_library;

/**
 *
 * @class PayCash
 *
 * @brief Represents a cash payment strategy for car rentals.
 *
 *        The PayCash class implements the CarPaymentStrategyPattern interface
 *        and provides methods for handling cash payments
 *
 *        for car rentals. It allows users to pay for their car rental using
 *        cash.
 */
public class PayCash implements CarPaymentStrategyPattern {
  /**
   *
   * @brief Retrieves the payment details. This method retrieves the payment
   *        details for the cash payment strategy.
   * @return true, indicating that payment details are available.
   */
  @Override
  public boolean PaymentDetails() {
    return true;
  }

  /**
   *
   * @brief Performs the cash payment. This method performs the cash payment for
   *        the car rental.
   * @param price The amount of money used for the payment.
   */

  @Override
  public void PaySystem(int price) {
    System.out.println(price + "money used.");
    System.out.println("You rented the car");
  }

  /**
   *
   * @brief Collects the payment system details. This method collects the
   *        necessary details for the cash payment system.
   */
  @Override
  public void CollectPaymentSystemDetails() {
  }

}
