
/**

@file PayCreditCard.java
@brief This file contains the implementation of the PayCreditCard class.
The PayCreditCard class is a part of the CE204_HW4_Library package and implements the CarPaymentStrategyPattern interface.
It provides methods for handling credit card payments for car rentals.
*/
package ce204_hw4_library;

/**

@class PayCreditCard

@brief Represents a credit card payment strategy for car rentals.

The PayCreditCard class implements the CarPaymentStrategyPattern interface and provides methods for handling credit card

payments for car rentals. It allows users to pay for their car rental using a credit card.
*/

public class PayCreditCard implements CarPaymentStrategyPattern {

  private CreditCardSystem creditCard;
  private int totalMoney = 500;
  /**

  @brief Retrieves the payment details.
  This method retrieves the payment details for the credit card payment strategy.
  @return true, indicating that payment details are available.
  */
  @Override
  public boolean PaymentDetails() {
    return true;
  }
  /**

  @brief Performs the credit card payment.
  This method performs the credit card payment for the car rental.
  @param price The amount of money used for the payment.
  */
  @Override
  public void PaySystem(int price) {
    System.out.println("Paying " + price + " using Credit Card.");
    setPrice(getPrice() - price);
    System.out.println(getPrice() + " remanined in the card.");
    System.out.println("You rented the car");
  }
  /**

  @brief Collects the payment system details.
  This method collects the necessary details for the credit card payment system.
  */
  @Override
  public void CollectPaymentSystemDetails() {
    creditCard = new CreditCardSystem("7845124233224471", "08/24", "778");
  }
  /**

  @brief Retrieves the total amount of money available in the credit card.
  This method retrieves the total amount of money available in the credit card.
  @return The total amount of money available in the credit card.
  */
  public int getPrice() {
    // TODO Auto-generated method stub
    return totalMoney;
  }
  /**

  @brief Sets the total amount of money available in the credit card.
  This method sets the total amount of money available in the credit card.
  @param i The total amount of money to be set in the credit card.
  */
  public void setPrice(int i) {
    // TODO Auto-generated method stub
    totalMoney = i;
  }
  /**

  @brief Retrieves the credit card system.
  This method retrieves the credit card system.
  @return The credit card system.
  */
  public CreditCardSystem CreditCard() {
    return creditCard;
  }
}
